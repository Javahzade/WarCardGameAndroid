package com.deveducation.mygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var leftCard: ImageView
    lateinit var rightCard: ImageView
    lateinit var leftScore: TextView
    lateinit var rightScore: TextView
    lateinit var dealB: ImageView
    lateinit var restartB: Button
    lateinit var win: TextView
    lateinit var exit: Button
    var player = 0
    var cpu = 0
    var score = 0
    val maxScore = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exit = findViewById(R.id.b_exit)
        leftCard = findViewById(R.id.iv_card_left)
        rightCard = findViewById(R.id.iv_card_right)
        leftScore = findViewById(R.id.tv_score_left)
        rightScore = findViewById(R.id.tv_score_right)
        restartB = findViewById(R.id.b_restart)
        dealB = findViewById(R.id.b_deal)
        win = findViewById(R.id.tv_win)
    }

        fun deal(view: View) {

            val left = (2..14).random()
            val right = (2..14).random()

            val leftID = resources.getIdentifier("@drawable/card$left", null, packageName)
            leftCard.setImageResource(leftID)
            val rightID = resources.getIdentifier("@drawable/card$right", null, packageName)
            rightCard.setImageResource(rightID)


            if (left > right) {
                player += 1
                leftScore.text = player.toString()
            } else if (right > left) {
                cpu += 1
                rightScore.text = cpu.toString()
            }

            score = if (player > cpu) {
                player
            } else {
                cpu
            }

            if (score == maxScore) {
                if (player > cpu) {
                    win.text = "PLAYER WON!"
                    dealB.visibility = View.INVISIBLE
                    restartB.visibility = View.VISIBLE

                } else if (cpu > player) {
                    win.text = "CPU WON!"
                    dealB.visibility = View.INVISIBLE
                    restartB.visibility = View.VISIBLE
                }
            }
        }
    fun restart (view: View){
        player = 0
        cpu = 0
        leftScore.text = ""
        rightScore.text = ""
        score = 0
        rightCard.setImageResource(R.drawable.back)
        leftCard.setImageResource(R.drawable.back)
        dealB.visibility = View.VISIBLE
        restartB.visibility = View.INVISIBLE
        win.text = ""
    }
    fun exitB (view: View){
        exitProcess(-1)
    }


    }


