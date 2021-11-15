package com.example.testingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val username = findViewById<EditText>(R.id.edUser)
val password = findViewById<EditText>(R.id.edPass)
val cPass = findViewById<EditText>(R.id.edCpass)


      val result =  RegistrationUtil.validateRegistrationInput(username.text.toString(),"pass","cpass")
    }
}