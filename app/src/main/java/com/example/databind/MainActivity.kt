package com.example.databind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: Myname = Myname("Kiong")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        binding.buttonDone.setOnClickListener {
            showName()
        }
    }

    private fun showName(){
        binding.apply {
        myName?.name = editTextName.text.toString()
        this.invalidateAll()
        }
    }
}
