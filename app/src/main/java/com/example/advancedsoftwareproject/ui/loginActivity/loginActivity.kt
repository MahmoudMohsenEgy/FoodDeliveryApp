package com.example.advancedsoftwareproject.ui.loginActivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.homeActivity.MainActivity
import com.example.advancedsoftwareproject.ui.signUpActivity.SignUpActivity
import kotlinx.android.synthetic.main.activity_login.*
var changedUser= false
var changedPass = false
@Suppress("UNREACHABLE_CODE")
class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //LOGIN BUTTON IS DISABLED UNTIL USERNAME AND PASSWORD ARE ENTERED
        /*username.setOnFocusChangeListener { view, b ->
            changedUser=true
            login.isEnabled = changedPass
        }
        password.setOnFocusChangeListener { view, b ->
            changedPass=true
            login.isEnabled = changedUser
        }*/
        login.isEnabled = true
        login.setOnClickListener {
            println("hhhhhhhh")
            val mainIntent = Intent(this, MainActivity::class.java)
            this.startActivity(mainIntent)
            this.finish()
        }
        signup.setOnClickListener {
            var intentToSignUp = Intent(this, SignUpActivity::class.java)
            startActivity(intentToSignUp)
        }
    }


}