package com.example.deeplinking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deeplinking.databinding.ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondScreenBinding
    lateinit var data: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        data = intent.data?.pathSegments.toString()
        if (data.isNotEmpty()) {
            binding.data.text = data
        }

        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}