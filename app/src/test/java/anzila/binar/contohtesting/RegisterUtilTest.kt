package anzila.binar.contohtesting

import org.junit.Assert.*
import org.junit.Test

class RegisterUtilTest{
    @Test
    fun validUsername(){
        val result =  RegisterUtil.validateRegistrationInput(
            "jeje",
            "jeje123",
            "jeje123"
        )
        assertEquals("oke", result, true)
    }

    @Test
    fun usernameEmpty(){
        val user = "dino"
        val result = RegisterUtil.validateRegistrationInput(user, "yaya", "yaya")
        assertEquals("oke", result, false)
    }

    @Test
    fun existingUsername(){
        val user = "Rara"
        val result = RegisterUtil.validateRegistrationInput(user, "yuyu", "yuyu")
        assertEquals("usernameexis", result, false)
    }

    @Test
    fun passRepassMatch(){
        val user = "Dudu"
        val result = RegisterUtil.validateRegistrationInput(user, "dudu123", "dudu234")
        assertEquals("passRepass", result, false)
    }

    @Test
    fun passDigits(){
        val user = "Yuyu"
        val result = RegisterUtil.validateRegistrationInput(user, "2", "2")
        assertEquals("passRepass", result, false)
    }

    @Test
    fun allEmpty(){
        val result = RegisterUtil.validateRegistrationInput("", "", "")
        assertEquals("allempty", result, false)
    }
}