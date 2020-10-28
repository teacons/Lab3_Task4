package com.example.task4

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_DOCUMENT
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about.*

class ActivityAbout : MenuAppCompatActivity() {
    var easterEggCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        title = this::class.java.simpleName
        activity_about_text.setOnClickListener {
            easterEggCounter++
            if (easterEggCounter == 3)
                Toast.makeText(this, "Осталось 2 шага", Toast.LENGTH_SHORT).show()
            if (easterEggCounter == 5) {
                Toast.makeText(this, "Режим котиков включен", Toast.LENGTH_SHORT).show()
                startActivity(
                    Intent(this, ActivityEasterEgg::class.java).addFlags(
                        FLAG_ACTIVITY_NEW_DOCUMENT
                    )
                )
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return false
    }
}