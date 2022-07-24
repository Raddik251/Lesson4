package task2

import org.junit.Test

import org.junit.Assert.*

class Main2KtTest {

    @Test
    fun moneyTransferVisa() {
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

    @Test
    fun moneyTransferMaestro() {
        //arrange
        val transfer = 4_000_00
        val sumOld = 500_000_00
        val type = "Maestro"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 4400 копеек", result)
    }

    @Test
    fun moneyTransferDefault() {
        //arrange
        val transfer = 4_000_00

        //act
        val result = moneyTransfer(
            transferNow = transfer
        )

        //assert
        assertEquals("Комиссия за перевод составила 0 копеек", result)
    }

    @Test
    fun moneyTransferVisaBigSum() {
        //arrange
        val transfer = 20_000_00
        val sumOld = 500_000_00
        val type = "Visa"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 15000 копеек", result)
    }

    @Test
    fun moneyTransferMastercard() {
        //arrange
        val transfer = 2_000_00
        val sumOld = 50_000_00
        val type = "Mastercard"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 0 копеек", result)
    }

    @Test
    fun moneyTransferMIR() {
        //arrange
        val transfer = 20_000_00
        val sumOld = 300_000_00
        val type = "MIR"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 15000 копеек", result)
    }

    @Test
    fun moneyTransferMirBigSum() {
        //arrange
        val transfer = 7_334_67
        val sumOld = 300_000_00
        val type = "MIR"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 5501 копейку", result)
    }

    @Test
    fun moneyTransferMastercardBigSum() {
        //arrange
        val transfer = 3_670_00
        val sumOld = 800_000_00
        val type = "Mastercard"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 4202 копейки", result)
    }

    @Test
    fun moneyTransferMaestroBigSum() {
        //arrange
        val transfer = 36_700_00
        val sumOld = 800_000_00
        val type = "Maestro"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 24020 копеек", result)
    }

    @Test
    fun moneyTransferVisaReminder11() {
        //arrange
        val transfer = 67_348_00
        val sumOld = 500_000_00
        val type = "Visa"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 50511 копеек", result)
    }

    @Test
    fun moneyTransferVisaReminder12() {
        //arrange
        val transfer = 133_349_34
        val sumOld = 500_000_00
        val type = "Visa"

        //act
        val result = moneyTransfer(
            transferNow = transfer,
            sumOldTransfers = sumOld,
            typeOfCard = type
        )

        //assert
        assertEquals("Комиссия за перевод составила 100012 копеек", result)
    }
}