package task2

import org.junit.Test

import org.junit.Assert.*

class Main2KtTest {

    @Test
    fun moneyTransfer() {
        //arrange
        val transfer = 50_000_00
        val sumOld = 500_000_00
        val type = "Maestro"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 32000 копеек", result)
    }
}