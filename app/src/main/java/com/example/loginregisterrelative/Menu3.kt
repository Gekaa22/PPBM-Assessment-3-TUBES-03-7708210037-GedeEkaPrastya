package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        val buttonClick = findViewById<TextView>(R.id.promolagi)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.mended)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu2 ::class.java)
            startActivity(intent1)
            finish()


        })
        val buttonClick2 = findViewById<ImageView>(R.id.pesan3)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Konser ::class.java)
            startActivity(intent2)
            finish()


        })
        val buttonClickMenu3 = findViewById<ImageView>(R.id.profile2)
        buttonClickMenu3.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, About::class.java)
            startActivity(intent2)
            finish()
        })
    }
}