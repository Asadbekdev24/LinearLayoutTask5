package com.example.linearlayouttask5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val id1 = findViewById<TextView>(R.id.id1)
        val id2 = findViewById<TextView>(R.id.id2)
        val id3 = findViewById<TextView>(R.id.id3)
        val id4 = findViewById<TextView>(R.id.id4)
        val id5 = findViewById<TextView>(R.id.id5)

        id1.setOnClickListener{
          id5.text="Siz jigarrang rangdagi tugmani bosdingiz"
        }
        id2.setOnClickListener{
            id5.text="Siz ko'k rangdagi tugmani bosdingiz"
        }
        id3.setOnClickListener {
            id5.text = "Siz yashil rangdagi tugmani bosdingiz"
        }
        id4.setOnClickListener{
            id5.text="Siz sariq rangdagi tugmani bosdingiz"
        }

    }
}