package com.deveducation.mygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {



    private lateinit var leftCard :ImageView
    private lateinit var rightCard :ImageView
    var leftPlayer = 0
    var rightPlayer = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logo = findViewById<ImageView>(R.id.iv_card_center)
        val lefCard = findViewById<ImageView>(R.id.iv_card_left)
        val rightCard = findViewById<ImageView>(R.id.iv_card_right)
        val deal = findViewById<ImageView>(R.id.b_deal)
        val scoreLeft = findViewById<TextView>(R.id.tv_score_left)
        val scoreRight = findViewById<TextView>(R.id.tv_score_right)

    }
    fun dealButton (view: View){
        var right = Random.nextInt(2..14)
        var left = Random.nextInt(2..14)












    }




}
