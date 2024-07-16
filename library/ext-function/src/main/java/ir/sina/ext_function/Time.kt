package ir.sina.ext_function

val Int.minutes: Int
    get() = this / 60

val Int.seconds: Int
    get() = this % 60

fun String.toTwoDigitFormat() = if (length == 1) "0$this" else this