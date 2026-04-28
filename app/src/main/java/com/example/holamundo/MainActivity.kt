package com.example.holamundo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Esta línea es la que conecta con tu archivo activity_main.xml
        setContentView(R.layout.activity_main)
    }
}