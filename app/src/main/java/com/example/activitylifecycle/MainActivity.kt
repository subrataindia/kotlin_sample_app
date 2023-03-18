package com.example.activitylifecycle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn1)
        btn.setOnClickListener(){
            // Explicit Intents
            var intent = Intent(this, Activity2:: class.java)

            // Pass data
            intent.putExtra("name","Subrata")
            startActivity(intent)
        }

        val btn1 = findViewById<Button>(R.id.btn2)
        btn1.setOnClickListener(){
            // Implicit Intent
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://google.co.in"))
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener(){
            // Implicit Intent to SHARE
            var intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_SUBJECT,"Subrata is Sharing")
            intent.putExtra(Intent.EXTRA_TEXT,"This is the body of text to be shared.")
            startActivity(intent)
        }

        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener(){
            var intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent);
        }

        Toast.makeText(this, "onCreate() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop() Method is called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestory() Method is called", Toast.LENGTH_LONG).show()
    }


}