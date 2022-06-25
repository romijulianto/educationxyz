package com.romijulianto.educationxyz.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.romijulianto.educationxyz.R

@Suppress("DEPRECATION")
class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this@StartActivity, OnBoarding::class.java))
            finish()
        }, 3000)
    }
}