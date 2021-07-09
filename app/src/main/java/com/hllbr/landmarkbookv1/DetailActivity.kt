package com.hllbr.landmarkbookv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var intent = intent
        var nameHomor = intent.getStringExtra("name")
        textView.text = nameHomor
        imageView.setImageBitmap(selectedGlobalBitmap)

    }
}