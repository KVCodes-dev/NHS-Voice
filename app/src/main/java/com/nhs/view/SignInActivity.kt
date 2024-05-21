package com.nhs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nhs.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        buttonClicks()
    }

    private fun buttonClicks() {
        goButton.setOnClickListener(){
             }
        signUpButton.setOnClickListener(){

        }

    }
}