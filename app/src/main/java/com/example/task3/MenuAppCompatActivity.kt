package com.example.task3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

abstract class MenuAppCompatActivity : AppCompatActivity() {

    companion object {
        const val key = "LifeCycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = this::class.java.simpleName
        Log.d(key, "${this::class.java.simpleName} onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_default, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about -> {
                val intent = Intent(this, ActivityAbout::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(key, "${this::class.java.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(key, "${this::class.java.simpleName} onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(key, "${this::class.java.simpleName} onDestroy")
    }
}