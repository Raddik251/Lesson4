package task1

fun main () {

    println("Введите время последнего входа пользователя (в секундах)")

    var timeInput = readLine()?.toInt() ?: return

    timeIn = timeInput

    println(agoToText(timeIn))

}