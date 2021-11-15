package com.example.testingdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){

        val result = RegistrationUtil.validateRegistrationInput("","123","123")

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and password return true`(){

        val result = RegistrationUtil.validateRegistrationInput("rahul","123","123")
        assertThat(result).isTrue()
    }

    @Test
    fun `valid username and empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput("rahul","","")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and wrong password return false`(){
        val result = RegistrationUtil.validateRegistrationInput("rahul","123","321")
        assertThat(result).isFalse()
    }

    @Test
    fun `password is less then two char return false`(){
        val result = RegistrationUtil.validateRegistrationInput("rahul","aoo","aoo")
        assertThat(result).isFalse()
    }
}