package com.example.testingdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest{


    @Test
    fun `check fib return false`(){
       val result = Homework.fib(-1)
        assertThat(result)
    }
}