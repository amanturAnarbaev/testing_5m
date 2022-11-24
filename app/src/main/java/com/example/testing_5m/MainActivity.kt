package com.example.testing_5m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testing_5m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adding()

    }

    fun adding() {
        binding.click.setOnClickListener {
            binding.result.text =
                Math().add(binding.firstN.text.toString(), binding.secondN.text.toString())
        }
        binding.clickDivide.setOnClickListener {
            binding.result.text =
                com.example.testing_5m.Math()
                    .divide(binding.firstN.text.toString(), binding.secondN.text.toString())
        }
    }
}