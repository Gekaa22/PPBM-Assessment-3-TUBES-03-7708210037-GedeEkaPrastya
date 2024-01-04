package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val buttonClick = findViewById<Button>(R.id.balik)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })

        val buttonClickst = findViewById<Button>(R.id.button)
        buttonClickst.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,ProfileActivity1 ::class.java)
            startActivity(intent)


        })

        val buttonClickig = findViewById<Button>(R.id.button2)
        buttonClickig.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,ProfileActivity2 ::class.java)
            startActivity(intent)


        })

        val buttonClicktt = findViewById<Button>(R.id.button3)
        buttonClicktt.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,ActivityRibet ::class.java)
            startActivity(intent)


        })

        val buttonClickft = findViewById<Button>(R.id.button5)
        buttonClickft.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,ImageSliderAct ::class.java)
            startActivity(intent)


        })

        val buttonClickll = findViewById<Button>(R.id.button4)
        buttonClickll.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,SocmedActivity ::class.java)
            startActivity(intent)


        })




    }
}