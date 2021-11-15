package com.example.testingdemo

object RegistrationUtil {

    val userList = listOf<String>("rahull","tyagi")

    fun validateRegistrationInput(
         userName:String,
         password:String,
         confirmPassword:String
    ) :Boolean

    {
       if (userName.isEmpty() || password.isEmpty()){
           return false
       }
        if (userName in userList){
            return false
        }
        if ( password != confirmPassword){
            return false
        }

        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}