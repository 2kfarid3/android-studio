package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View'leri tanımla
        val adSoyad = findViewById<EditText>(R.id.adSoyad)
        val goster = findViewById<TextView>(R.id.goster)
        val buttongoster = findViewById<Button>(R.id.buttongoster)

        // Edge-to-edge padding uygulaması
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Butonun onClick olayını tanımla
        buttongoster.setOnClickListener {
            goster.text = adSoyad.text.toString() // EditText'teki metni TextView'e aktar
            adSoyad.text.clear() // EditText'i temizle
        }
    }
}
