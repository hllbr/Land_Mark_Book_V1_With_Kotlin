package com.hllbr.landmarkbookv1

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
var selectedGlobalBitmap : Bitmap? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //this method is not safe

        var landmarkName = ArrayList<String>()

        landmarkName.add("Homor")
        landmarkName.add("Lisa")
        landmarkName.add("Bart")
        landmarkName.add("Marge")
        //Image
        val homor = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.simpson)
        val lisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lisa)
        val bart = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bart)
        val marge = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.marge)

        var landmarkSimpson = ArrayList<Bitmap>()
        landmarkSimpson.add(homor)
        landmarkSimpson.add(lisa)
        landmarkSimpson.add(bart)
        landmarkSimpson.add(marge)



        // var adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,landmarkName)
        var adapter = ArrayAdapter(this,R.layout.list_row,R.id.textView2,landmarkName)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
        var intent = Intent(applicationContext,DetailActivity::class.java)
            selectedGlobalBitmap = landmarkSimpson[position]
        intent.putExtra("name",landmarkName[position])
            startActivity(intent)
        }

    }
}