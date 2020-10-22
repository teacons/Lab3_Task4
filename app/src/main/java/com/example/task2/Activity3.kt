package com.example.task2

import android.os.Bundle
import kotlinx.android.synthetic.main.activity.*

class Activity3 : MenuAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        buttonNext.text = resources.getString(R.string.to_first)
        buttonNext.setOnClickListener {
            setResult(1)
            finish()
        }
        buttonBack.text = resources.getString(R.string.to_second)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}