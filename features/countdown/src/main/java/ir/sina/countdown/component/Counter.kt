package ir.sina.countdown.component

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import ir.sina.countdown.CountDownState
import ir.sina.designsystem.theme.EBreakTheme
import ir.sina.ext_function.minutes
import ir.sina.ext_function.seconds

@Composable
fun Counter(
    countDownState: CountDownState,
) {

    val seconds by remember {
        mutableStateOf(countDownState.remainTime.seconds.toString())
    }

    val minutes by remember {
        mutableStateOf(countDownState.remainTime.minutes.toString())
    }
    Row {
        CounterText(minutes)
        CounterText(" : ")
        CounterText(seconds)
    }
}


@Preview(showSystemUi = true)
@Composable
private fun CounterPreview() {
    EBreakTheme {
        Counter(CountDownState())

    }
}