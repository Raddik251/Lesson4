package task1

const val MIN = 60
const val HOUR = MIN * 60
const val DAY = HOUR * 24

var timeAgo = "не в сети"
var timeIn = 0

fun agoToText (timeIn:Int) : String {
    var minIn = (timeIn % HOUR) / MIN
    var hourIn = (timeIn % DAY) / HOUR
    when (timeIn) {
        in 1..MIN -> timeAgo = "Пользователь был(а) в сети только что"
        in (MIN + 1)..(HOUR) -> timeAgo = "Пользователь был(а) в сети $minIn ${messageMins(timeIn)} назад"
        in (HOUR + 1)..(DAY) -> timeAgo = "Пользователь был(а) в сети $hourIn ${messageHours(timeIn)} назад"
        in (DAY + 1)..(DAY * 2) -> timeAgo = "Пользователь был(а) в сети ${messageDays(timeIn)}"
        in ((DAY * 2) + 1)..(DAY * 3) -> timeAgo = "Пользователь был(а) в сети ${messageDays(timeIn)}"
        in ((DAY * 3) + 1)..Int.MAX_VALUE -> timeAgo = "Пользователь был(а) в сети ${messageDays(timeIn)}"
    }
    return timeAgo
}

fun messageMins (timeIn:Int) : String {
    var minIn = (timeIn % HOUR) / MIN
    var minText = "минута"
    var minRemainder10 = minIn % 10
    var minRemainder100 = minIn % 100
    if (minRemainder10 === 1 && minIn %  100 != 11) {
        minText = "минуту"
    } else if (minRemainder10 >= 2 && minRemainder10 <= 4 && (minRemainder100 - minRemainder10) != 10) {
        minText = "минуты"
    } else {
        minText = "минут"
    }
    return minText
}

fun messageHours (timeIn:Int) : String {
    var hourIn = (timeIn % DAY) / HOUR
    var hourText = "час"
    var hourRemainder10 = hourIn % 10
    var hourRemainder100 = hourIn % 100
    if (hourRemainder10 === 1 && hourIn %  100 != 11) {
        hourText = "час"
    } else if (hourRemainder10 >= 2 && hourRemainder10 <= 4 && (hourRemainder100 - hourRemainder10) != 10) {
        hourText = "часа"
    } else {
        hourText = "часов"
    }
    return hourText
}

fun messageDays (timeIn:Int) : String {
    var dayIn = timeIn / DAY
    var dayText = "день"
    when (dayIn) {
        1 -> dayText = "вчера"
        2 -> dayText = "позавчера"
        in 3..Int.MAX_VALUE -> dayText = "давно"
    }
    return dayText
}