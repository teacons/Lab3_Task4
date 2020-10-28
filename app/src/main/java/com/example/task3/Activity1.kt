package com.example.task3

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity.*

class Activity1 : MenuAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        buttonNext.text = resources.getString(R.string.to_second)
        buttonNext.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        buttonBack.visibility = View.GONE
    }
}