package com.nhs.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.nhs.R
import java.util.*
import kotlin.concurrent.schedule

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        sendToNextActivity()

    }

    //Initialisation of all the views
    private fun iniView() {

    }

    private fun sendToNextActivity() {
        val timer = Timer("schedule", true);

        // schedule a single event
        timer.schedule(3000) {
            startActivity(Intent(this@LaunchActivity, SignInActivity::class.java))
            finish()

        }
    }
}