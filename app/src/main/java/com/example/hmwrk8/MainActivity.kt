package com.example.hmwrk8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import com.example.hmwrk8.databinding.GetstartedBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: GetstartedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetstarted.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
            }
            startActivity(intent)
            finish()
        }
    }
//    override fun onPause() {
//        super.onPause()
//        d("methodName","onPause - დაპაუზდა  ექთივითი") // დაპაუზება
//    }
//
//    override fun onStart() {
//        super.onStart()
//        d("methodName","onStart - ჩაიტვირთა ექთივითი") // დაწყება ხდება მაშნაც როცა ეკრანი ჩაქვრება და მერე აანთებ ისევ
//    }
//
//    override fun onStop() {
//        super.onStop()
//        d("methodName","onStop - გაჩერდა აპლიკაცია") // გაჩერება ხდება როცა დაიბლოკება ეკრანი, ან ჩაქვრება, ან ხელით აწევ და წაშლი რესენთებიდან
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        d("methodName","onDesroy - განადგურდა აპი")
//    }
}