package com.example.advancedsoftwareproject.ui.splashScreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.homeActivity.MainActivity
import com.example.advancedsoftwareproject.ui.loginActivity.loginActivity


class startUPActivity : AppCompatActivity() {
    private val SPLASHDISPLAYLENGTH:Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_u_p)
        Handler().postDelayed(Runnable {

            val mainIntent = Intent(this, loginActivity::class.java)
            this.startActivity(mainIntent)
            this.finish()

        }, SPLASHDISPLAYLENGTH)
    }
}