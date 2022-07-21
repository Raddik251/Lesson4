package task1

fun main () {

    println("Введите время последнего входа пользователя (в секундах)")

    var timeIn = readLine()?.toInt() ?: return

    println(agoToText(timeIn))

}