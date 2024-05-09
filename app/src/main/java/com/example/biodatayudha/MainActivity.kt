package com.example.biodatayudha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.net.Uri;
import com.example.biodatayudha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonHide.setOnClickListener {
            val group = binding.groupDeskripsi

            if(group.visibility == View.INVISIBLE){
                group.visibility = View.VISIBLE
                binding.buttonHide.text = "Tampilkan Deskripsi"
            } else {
                group.visibility = View.INVISIBLE
                binding.buttonHide.text = "Sembunyikan Deskripsi"
            }
        }

        binding.buttonGithub.setOnClickListener {
            val url = "https://github.com/BagasYudha"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}