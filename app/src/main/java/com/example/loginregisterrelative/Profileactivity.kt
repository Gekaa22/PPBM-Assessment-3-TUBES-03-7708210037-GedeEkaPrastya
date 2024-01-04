package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView

class Profileactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileactivity)

        val submitted = findViewById<SlideToActView>(R.id.start)
        submitted.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val dialog = BottomSheetDialog(this@Profileactivity)
                val bottomSheetView =
                    layoutInflater.inflate(R.layout.activity_bottomsheet, null)
                dialog.setContentView(bottomSheetView)
                dialog.show()

                // Add a delay of 3 seconds before navigating to MainActivity
                Handler(Looper.getMainLooper()).postDelayed({
                    val pintomain = Intent(this@Profileactivity, MainActivity::class.java)
                    startActivity(pintomain)
                }, 3000) // 3000 milliseconds = 3 seconds

            }


        }
    }
}