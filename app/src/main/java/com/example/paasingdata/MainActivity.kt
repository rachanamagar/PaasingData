package com.example.paasingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paasingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener(){

            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()
            val person = Person(name, age, country)

            Intent(this, SecondActivity::class.java).also {
               it.putExtra("Extra Person", person)
                startActivity(it)
            }
        }
    }
}