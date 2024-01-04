package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonClick = findViewById<ImageView>(R.id.promo)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Menu2::class.java)
            startActivity(intent)
            finish()


        })


        val buttonClick1 = findViewById<TextView>(R.id.booking1)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this, Menu3::class.java)
            startActivity(intent1)
            finish()


        })
        val buttonClick2 = findViewById<ImageView>(R.id.pesan)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Konser::class.java)
            startActivity(intent2)
            finish()


        })

        val buttonClickMenu3 = findViewById<ImageView>(R.id.profile)
        buttonClickMenu3.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, About::class.java)
            startActivity(intent2)
            finish()
        })

        val buttonClickMenu4 = findViewById<ImageView>(R.id.book)
        buttonClickMenu4.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Booking::class.java)
            startActivity(intent2)
            finish()
        })
    }
}