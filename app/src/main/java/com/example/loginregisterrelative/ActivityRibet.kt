package com.example.loginregisterrelative


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


import androidx.appcompat.app.AppCompatActivity

class ActivityRibet : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ribet)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        val adapter = MyAdapter(supportFragmentManager, 3) // 3 is the number of tabs
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)

        val buttonClickmenuu = findViewById<ImageView>(R.id.back4)
        buttonClickmenuu.setOnClickListener {

            val pindah = Intent(this, About::class.java)
            startActivity(pindah)

        }

    }


}