package com.example.biodatayudha.berita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biodatayudha.R
import com.example.biodatayudha.fragment.FirstFragment
import com.example.biodatayudha.fragment.SecondFragment
import com.example.biodatayudha.fragment.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.for_you -> {
                    val fragment = FirstFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.tempat_fragment, fragment)
                        .addToBackStack(null)
                        .commit()
                    true
                }
                R.id.trending -> {
                    val fragment = SecondFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.tempat_fragment, fragment)
                        .addToBackStack(null)
                        .commit()
                    true
                }
                else -> {
                    val fragment = ThirdFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.tempat_fragment, fragment)
                        .addToBackStack(null)
                        .commit()
                    true
                }
            }
        }
    }
}