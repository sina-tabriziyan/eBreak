package ir.sina.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.sina.countdown.component.Counter
import ir.sina.countdown.component.CounterController
import ir.sina.designsystem.theme.EBreakTheme


@Composable
fun CountDownRout(
    viewModel: CountDownViewModel,
    modifier: Modifier = Modifier
) {
//    CountDownScreen()
}

@Composable
fun CountDownScreen(
    modifier: Modifier = Modifier,
    counterState: CounterState,
    countDownState: CountDownState,
    onRestClicked: () -> Unit,
    onStartClicked: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Counter(countDownState)
        Spacer(modifier = Modifier.height(16.dp))
        CounterController(
            counterState = counterState,
            onRestClicked = onRestClicked,
            onStartClicked = onStartClicked
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CountDownScreenPreview() {
    EBreakTheme {
        CountDownScreen(
            counterState = CounterState.INITIAL,
            countDownState = CountDownState(),
            onRestClicked = {},
            onStartClicked = {}
        )
    }
}