package com.example.biodatayudha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biodatayudha.databinding.ActivityChainBinding

class Chain : AppCompatActivity() {

    lateinit var binding: ActivityChainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityChainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}