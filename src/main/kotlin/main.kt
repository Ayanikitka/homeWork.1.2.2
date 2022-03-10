fun main() {
    val likes = 21

    val close = if ((likes % 100) / 10 == 1) "людям"
    else if (likes % 10 == 1) "человеку"
    else "людям"
    println(close)

}