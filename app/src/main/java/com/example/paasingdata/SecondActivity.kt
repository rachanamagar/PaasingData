package com.example.paasingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paasingdata.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

      val person = intent.getSerializableExtra("Extra Person") as Person
        binding.tvPerson.text = person.toString()
    }
}