package anzila.binar.contohtesting

object RegisterUtil {

    private val existingUsers = listOf("Rara", "Riri", "Ruru", "Rere")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword : String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit()} < 2) {
            return false
        }
        return true
    }
}