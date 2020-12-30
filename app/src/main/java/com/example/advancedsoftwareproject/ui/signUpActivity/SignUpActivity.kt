package com.example.advancedsoftwareproject.ui.signUpActivity
 import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.text.TextWatcher
    import android.view.MotionEvent
    import android.view.View
    import android.widget.Toast
    import com.example.advancedsoftwareproject.R
    import com.example.advancedsoftwareproject.ui.homeActivity.MainActivity
    import com.example.advancedsoftwareproject.ui.signUpActivity.SignUpActivity
    import kotlinx.android.synthetic.main.activity_login.*
 import kotlinx.android.synthetic.main.activity_login.password
 import kotlinx.android.synthetic.main.activity_sign_up.*
 import java.time.Duration

@Suppress("UNREACHABLE_CODE")
    class SignUpActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_sign_up)
            var passChanged= false
            var confirmPassChanged = false

            registerButton.isEnabled=true

           /* password.setOnFocusChangeListener { view, b ->
                if(password.text.toString() == passwordconfirm.text.toString()){
                    registerButton.isEnabled = true
                }
                else{
                    registerButton.isEnabled = false
                }
            }
            passwordconfirm.setOnFocusChangeListener { view, b ->
                if(password.text.toString() == passwordconfirm.text.toString()){
                    registerButton.isEnabled = true
                }
                else{
                    registerButton.isEnabled = false
                }
            }*/
            registerButton.setOnClickListener {
                if (password.text.toString() == passwordconfirm.text.toString()){
                    val goToMainActivityIntent = Intent(this,MainActivity::class.java)
                    startActivity(goToMainActivityIntent)
                }
                else{
                    Toast.makeText(applicationContext,"MAKE SURE PASSWORD MATCH! ", Toast.LENGTH_LONG).show()
                }
            }
        }
    }