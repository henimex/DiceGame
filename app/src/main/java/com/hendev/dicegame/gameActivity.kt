package com.hendev.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class gameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val rndm = (0..20).random()
        Log.e("Radnom", rndm.toString())

        val guess = edtGuess.text
        val finVal = Integer.parseInt(guess)

        if (finVal < rndm){
            txtInfo.text = "Yukarı"
        }
    }
}