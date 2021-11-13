package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class RegistrationProcess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_process)

        val Kotlin = findViewById<CheckBox>(R.id.checkbox1)
        val Python = findViewById<CheckBox>(R.id.checkbox2)
        val Java = findViewById<CheckBox>(R.id.checkbox3)
        val Cpp = findViewById<CheckBox>(R.id.checkbox4)


        Kotlin.setOnClickListener(){
            Toast.makeText(applicationContext, "Kotlin is selected", Toast.LENGTH_SHORT).show()
        }
        Python.setOnClickListener(){
            Toast.makeText(applicationContext, "Python is selected", Toast.LENGTH_SHORT).show()
        }
        Java.setOnClickListener(){
            Toast.makeText(applicationContext, "Java is selected", Toast.LENGTH_SHORT).show()
        }
        Cpp.setOnClickListener(){
            Toast.makeText(applicationContext,"C++ is selected",Toast.LENGTH_SHORT).show()
        }


    }
}