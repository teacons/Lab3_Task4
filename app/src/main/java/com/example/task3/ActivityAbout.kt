package com.example.task3

import android.os.Bundle
import android.view.Menu

class ActivityAbout : MenuAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        title = this::class.java.simpleName
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return false
    }
}