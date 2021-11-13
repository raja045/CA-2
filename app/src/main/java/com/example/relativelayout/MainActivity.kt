package com.example.relativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    lateinit var radioButton :RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.subMit)
        val group = findViewById<RadioGroup>(R.id.grp)
        val win = findViewById<RadioButton>(R.id.batch1)
        val mc = findViewById<RadioButton>(R.id.batch2)
        val lx = findViewById<RadioButton>(R.id.batch3)
        val tru = findViewById<RadioButton>(R.id.yes)
        val fals = findViewById<RadioButton>(R.id.no)

        win.setOnClickListener(){
            Toast.makeText(applicationContext,  "Windows",LENGTH_SHORT).show()
        }
        mc.setOnClickListener(){
            Toast.makeText(applicationContext,  "Mac",LENGTH_SHORT).show()
        }
        lx.setOnClickListener(){
            Toast.makeText(applicationContext,  "Linux",LENGTH_SHORT).show()
        }
        tru.setOnClickListener(){
            Toast.makeText(applicationContext, "You are using mobile as Emulator", LENGTH_SHORT).show()
        }
        fals.setOnClickListener(){
            Toast.makeText(applicationContext,  "You are not using mobile as Emulator ",LENGTH_SHORT).show()
        }

        btn.setOnClickListener(){

           val intent = Intent(this,RegistrationProcess::class.java)
           startActivity(intent)
        }
    }
}