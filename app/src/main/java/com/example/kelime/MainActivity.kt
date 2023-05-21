package com.example.kelime

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val letterList = mutableListOf<String>()
    private val wordList = listOf("elma", "armut", "kiraz") // Önceden belirlenmiş kelime listesi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener { onButtonClick(button1) }
        button2.setOnClickListener { onButtonClick(button2) }
        button3.setOnClickListener { onButtonClick(button3) }
    }

    private fun onButtonClick(button: Button) {
        button.setBackgroundColor(Color.GREEN)
        val letter = button.text.toString()
        letterList.add(letter)

        val currentWord = letterList.joinToString("") // Mevcut harfleri birleştirerek sözcüğü oluştur

        if (wordList.contains(currentWord)) {
            // Eşleşme var, ilgili düğmeleri yok et ve oyuncuya puan ver
            letterList.clear() // Mevcut harf listesini temizle
            // Düğmelerin yok edilmesi veya puan verilmesi gibi işlemleri gerçekleştir
            // Örneğin:
            removeButtons()
            givePoints()
        } else {
            // Eşleşme yok, listeyi temizle ve oyuna devam et
            // Örneğin:
            clearList()
        }
    }

    private fun clearList() {
        letterList.clear()
        // Düğmelerin arka plan rengini varsayılan değere döndürmek gibi diğer işlemleri gerçekleştir
    }

    private fun removeButtons() {
        // Düğmelerin yok edilmesiyle ilgili işlemleri gerçekleştir
    }

    private fun givePoints() {
        // Oyuncuya puan verme işlemlerini gerçekleştir
    }
}


