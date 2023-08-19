package com.example.myfirstmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.*
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.myfirstmobileapp.databinding.ActivityFullscreenBinding
class FullscreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFullscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root);
        val buttonCong : Button = binding.cong
        buttonCong.setOnClickListener {
            var so1 :Int = binding.editextso1.text.toString().toInt();
            var so2 :Int = binding.editextso2.text.toString().toInt();
            var kq :Int = so1+so2
            binding.ketqua.text = kq.toString()
        }
    }
}