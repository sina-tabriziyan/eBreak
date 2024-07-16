package ir.sina.countdown.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.sina.countdown.CounterState
import ir.sina.designsystem.ThemePreview
import ir.sina.designsystem.theme.EBreakTheme

@Composable
fun CounterController(
    modifier: Modifier = Modifier,
    counterState: CounterState,
    onRestClicked: () -> Unit,
    onStartClicked: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(0.3f),
            onClick = when (counterState) {
                CounterState.INITIAL -> onStartClicked
                CounterState.PLAY -> onRestClicked
                CounterState.PAUSE -> onRestClicked
            }
        ) {
            Icon(
                imageVector = when (counterState) {
                    CounterState.INITIAL -> Icons.Default.PlayArrow
                    CounterState.PLAY -> Icons.Filled.Close
                    CounterState.PAUSE -> Icons.Default.PlayArrow
                },
                contentDescription = null
            )
        }
    }
}

@ThemePreview
@Composable
private fun CounterControllerPreview() {
    EBreakTheme {
        Surface {
            CounterController(
                counterState = CounterState.PLAY,
                onRestClicked = {},
                onStartClicked = {},
            )
        }
    }
}