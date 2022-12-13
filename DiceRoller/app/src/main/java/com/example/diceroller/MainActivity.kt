package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val diceImage : ImageView = findViewById(R.id.imageView)
        rollButton.setOnClickListener {
            val myFirstDice = Dice(6)
            val rollResult = myFirstDice.Roll()
            val luckyNumber = 4
            when (rollResult) {
                luckyNumber -> println("Your win!")
                1 -> println("So sorry! You rolled a 1. Try again!")
                2 -> println("Sadly, you rolled a 2. Try again!")
                3 -> println("Unfortunately, you rolled a 3. Try again!")
                5 -> println("Don't cry! You rolled a 5. Try again!")
                6 -> println("Apologies! You rolled a 6. Try again!")
            }

            println("You ${myFirstDice.numSide} Sided, Dice rolled ${rollResult}!")

//          when (rollResult)
//            {
//                1 -> diceImage.setImageResource(R.drawable.dice_1)
//                2 -> diceImage.setImageResource(R.drawable.dice_2)
//                3 -> diceImage.setImageResource(R.drawable.dice_3)
//                4 -> diceImage.setImageResource(R.drawable.dice_4)
//                5 -> diceImage.setImageResource(R.drawable.dice_5)
//                6 -> diceImage.setImageResource(R.drawable.dice_6)
//            }

            val resultDrawable = when (rollResult){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(resultDrawable)
        }
    }
}
class Dice(val numSide: Int){
    fun Roll(): Int{
        return (1..numSide).random()
    }
}