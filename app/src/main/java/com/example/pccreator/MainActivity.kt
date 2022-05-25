package com.example.pccreator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pccreator.adapter.ItemAdapter
import com.example.pccreator.data.Datasource
import com.example.pccreator.databinding.ActivityMainBinding
import com.example.pccreator.model.Build

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val dataset = Datasource().loadBuilds()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = ItemAdapter(this, dataset as MutableList<Build>)

        binding.recyclerView.setHasFixedSize(true)

        binding.floatingActionButton.setOnClickListener()
        {
            val intent = Intent(this, Component::class.java)
            startActivity(intent)
        }
    }
}