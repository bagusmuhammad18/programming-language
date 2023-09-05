package com.example.programminglanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_language)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val language = intent.getParcelableExtra<Language>(MainActivity.INTENT_PARCELABLE)

        val imgLanguage = findViewById<ImageView>(R.id.img_item_photo)
        val nameLanguage = findViewById<TextView>(R.id.tv_item_name)
        val descLanguage = findViewById<TextView>(R.id.tv_item_description)

        imgLanguage.setImageResource(language?.imgLanguage!!)
        nameLanguage.text = language.nameLanguage
        descLanguage.text = language.descLanguage
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}