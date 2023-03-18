package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // Receiving Data from first activity
        val bundle: Bundle? = intent.extras

        val text3 = findViewById<TextView>(R.id.text3)
        text3.setText(text3.text.toString()+" for "+bundle?.getString("name"))
    }
}