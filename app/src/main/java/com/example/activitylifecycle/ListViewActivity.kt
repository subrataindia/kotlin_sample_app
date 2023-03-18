package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // 1 - Adapter View: ListView
        var listView = findViewById<ListView>(R.id.listview1)

        // 2 - Data Source: Array of Strings
        val countries = arrayOf("India","USA", "Germany","England")

        // 3 - Adapter
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries)
        // simple_list_item1 is inbuild layout provided by android
        listView.adapter = arrayAdapter;

    }
}