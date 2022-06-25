package com.romijulianto.educationxyz.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.romijulianto.educationxyz.MainActivity
import com.romijulianto.educationxyz.R

@Suppress("DEPRECATION")
class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this@OnBoarding, MainActivity::class.java))
            finish()
        }, 3000)
    }
}