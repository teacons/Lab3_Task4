package com.example.task2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity.*

class Activity2 : MenuAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        buttonNext.text = resources.getString(R.string.to_third)
        buttonNext.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivityForResult(intent, 0)
        }
        buttonBack.text = resources.getString(R.string.to_first)
        buttonBack.setOnClickListener {
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 1) finish()
    }
}