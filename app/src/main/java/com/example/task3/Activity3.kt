package com.example.task3

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
import android.os.Bundle
import kotlinx.android.synthetic.main.activity.*

class Activity3 : MenuAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        buttonNext.text = resources.getString(R.string.to_first)
        buttonNext.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
                .addFlags(FLAG_ACTIVITY_CLEAR_TOP or FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)

        }
        buttonBack.text = resources.getString(R.string.to_second)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}