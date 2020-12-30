package com.example.advancedsoftwareproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.advancedsoftwareproject.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_waiting_for_food.*
var initTime = 0
var finalTime = 0
var checkTimeIntialize = false
var lastTime = 0
var diffTime = 0

class WaitingForFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        finalTime = System.currentTimeMillis().toInt()/1000
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting_for_food)

        if(checkTimeIntialize) {
            diffTime = finalTime - initTime
            circle_timer_view.setCurrentTime(lastTime.toLong()- diffTime.toLong())
            circle_timer_view.startTimer()

        }
        else{
            circle_timer_view.setCurrentTime(1800)
            circle_timer_view.startTimer()
            checkTimeIntialize = true
        }



    }

    override fun onDestroy() {
        super.onDestroy()
       initTime = System.currentTimeMillis().toInt()/1000
        lastTime = circle_timer_view.currentTimeInSeconds.toInt()
    }

}