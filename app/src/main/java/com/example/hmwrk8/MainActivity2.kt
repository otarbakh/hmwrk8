package com.example.hmwrk8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hmwrk8.databinding.GetstartedBinding
import com.example.hmwrk8.databinding.SecondactcivityBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: SecondactcivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondactcivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}