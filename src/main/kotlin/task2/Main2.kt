package task2

const val FEE_VISA_MIR = 35_00 / 0.0075
const val LIMIT_DAY = 150_000_00
const val LIMIT_MONTH = 600_000_00
const val LIMIT_VKPAY_ONE = 15_000_00
const val LIMIT_VKPAY_MONTH = 40_000_00

fun main () {

    println("Введите сумму перевода:")
    var transferNow = readLine()?.toInt() ?: return

    println("Введите сумму предыдущих переводов за текущий месяц:")
    var sumOldTransfers = readLine()?.toInt() ?: return

    println("Введите тип карты:")
    var typeOfCard = readLine()?.toString() ?: return

    var sumTransfers = transferNow + sumOldTransfers

    val transfer = when {
        transferNow <= 35_00 -> println("Комиссия больше или равна сумме перевода. Перевод невозможен.")
        transferNow > LIMIT_DAY -> println("Превышен лимит переводов в день")
        sumTransfers > LIMIT_MONTH -> println("Превышен лимит переводов в месяц")
        typeOfCard == "Vk Pay" && transferNow > LIMIT_VKPAY_ONE -> println("Превышен лимит переводов по карте Vk Pay")
        typeOfCard == "Vk Pay" && sumTransfers > LIMIT_VKPAY_MONTH -> println("Превышен лимит переводов по карте Vk Pay")
        else -> moneyTransfer(transferNow, sumOldTransfers, typeOfCard)
    }

    println(transfer)

}

fun moneyTransfer (
    transferNow:Int,
    sumOldTransfers:Int = 0,
    typeOfCard: String = "Vk Pay"
) : String {
    var sumOfMonth = transferNow + sumOldTransfers
    var fee = 0
    var feeKop = "Копейка"
    when(typeOfCard) {
        "Mastercard", "Maestro" -> fee = if (sumOfMonth > 75_000_00) {
            ((transferNow * 0.006) + 20_00).toInt()
        } else 0
        "Visa", "Мир" -> fee = if (transferNow <= FEE_VISA_MIR) {
            35_00
        } else (transferNow * 0.0075).toInt()
        else -> fee = 0
    }

    var feeRemainder10 = fee % 10
    var feeRemainder100 = fee % 10

    var feeText = when {
        feeRemainder10 === 1 && feeRemainder100 != 11 -> feeKop = "копейку"
        feeRemainder10 in 2..4 && (feeRemainder100 - feeRemainder10) != 10 -> feeKop = "копейки"
        else -> "копеек"
    }

    var transferMessage = "Комиссия за перевод составила $fee $feeText"

    return  transferMessage
}