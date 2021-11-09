package com.example.recipeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Btn_2 = findViewById<Button>(R.id.Btn_2)
        Btn_2.setOnClickListener {
            val Intent = Intent(this,sign_up::class.java)
            startActivity(Intent)
        }
        val Btn_login = findViewById<Button>(R.id.Btn_login)
        Btn_login.setOnClickListener {
            val Intent=Intent(this,Recipes::class.java)
            startActivity(Intent)

        }




    }




}