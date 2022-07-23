package task2

import org.junit.Test

import org.junit.Assert.*

class Main2KtTest {

    @Test
    fun moneyTransfer() {
        //arrange
        val transfer = 4_000_00
        val sumOld = 500_000_00
        val type = "Visa"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 3500 копеек", result)
    }
}