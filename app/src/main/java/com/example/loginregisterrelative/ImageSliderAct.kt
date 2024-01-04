package com.example.loginregisterrelative

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class ImageSliderAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imageslider)
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1166048713253335110/1188167168840433806/45fba15e-6ecd-4036-9ea0-11ad49c8f00d.jpg?ex=659989e8&is=658714e8&hm=e26e984a6582af1b23a2ec10fa177456d9ecfdbc29c967399186349fcd46eb09&", "MAPS 2023."))
        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1166048713253335110/1188150583899729981/IMG_0333.JPG?ex=65997a75&is=65870575&hm=3fb2a6eab832e47ed93de44f39769ae9e79e95adf2b4a5bbc282632422355a98&", "Hari terakhir TIMES 6.0."))
        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1166048713253335110/1188150381335822457/DSCF1699.JPG?ex=65997a45&is=65870545&hm=8c6ba7fa6b3ceafb1aa1a588a88cd6efae34294e9ba1ad8f6e8f2b0ebf9e45ad&", "Sidang Anggaran Dasar dan Anggaran Rumah Tangga HIMATREDIA."))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}