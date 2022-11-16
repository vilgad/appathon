package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // int count = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        val increment: Button = findViewById(R.id.bt_increment)
        val counter: TextView = findViewById(R.id.tv_count)
        increment.setOnClickListener {
            count += 1
            counter.text = count.toString()
        }
    }
}