package ir.sina.countdown

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountDownViewModel : ViewModel() {

    private val _countdownState = mutableStateOf(CountDownState())
    val countdownState: State<CountDownState> = _countdownState
}

enum class CounterState {
    INITIAL, PLAY, PAUSE
}

enum class WorkingState {
    REST, WORK
}

const val REST_DURATION = 20
const val WORKING_DURATION = 20 * 60

data class CountDownState(
    val counterState: CounterState = CounterState.INITIAL,
    val workingState: WorkingState = WorkingState.REST,
    val remainTime: Int = REST_DURATION
)