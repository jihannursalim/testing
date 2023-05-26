package jihan.binar.testing

import org.junit.Assert.*

import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun validateRegistrationInput() {

        val result = RegistrationUtil.validateRegistrationInput(
            "Fajar",
            "9502",
            "9502"
        )

        assertEquals("oke", result, true)

    }
}