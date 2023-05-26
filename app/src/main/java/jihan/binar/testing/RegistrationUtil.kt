package jihan.binar.testing

object RegistrationUtil {

    private val existingUsers = listOf("Amira", "Alma", "Dzaky", "Rasyad")

    fun validateRegistrationInput(
        username : String,
        password : String,
        confirmedPassword : String
    ) : Boolean {

//        Input kosong
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }

//        Username/Password sudah tersedia
        if (username in existingUsers){
            return false
        }

//        Confirmed Password tidak sama dengan password
        if (password != confirmedPassword){
            return false
        }

//        Password kurang dari 2
        if (password.count { it.isDigit() } < 2){
            return false
        }

//        Semua syarat terpenuhi
        return true
    }
}