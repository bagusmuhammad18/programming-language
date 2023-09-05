package com.example.programminglanguage

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 1000 // Waktu penundaan dalam milidetik (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Membuat penundaan untuk splash screen
        Handler().postDelayed({
            // Ini akan dijalankan setelah SPLASH_TIME_OUT
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Tutup splash screen agar tidak bisa kembali
        }, SPLASH_TIME_OUT)
    }
}
