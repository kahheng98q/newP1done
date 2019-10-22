package com.example.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { (rollDice()) }



    }
    private fun rollDice(){
        val resultText1: ImageView =findViewById(R.id.text1)
        val resultText2: ImageView =findViewById(R.id.text2)
        val resultText3: ImageView =findViewById(R.id.text3)

        val randomInt=Random().nextInt(6)+1
        val randomInt2=Random().nextInt(6)+1
        val randomInt3=Random().nextInt(6)+1

        val draw=when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
        val draw2=when (randomInt2){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
        val draw3=when (randomInt3){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }

        resultText1.setImageResource(draw)
        resultText2.setImageResource(draw2)
        resultText3.setImageResource(draw3)

    }


}
