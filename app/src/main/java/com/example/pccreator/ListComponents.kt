package com.example.pccreator

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pccreator.adapter.itemAdapter2
import com.example.pccreator.data.*

class ListComponents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_copomponents)

        val imgviewarrow = findViewById<ImageView>(R.id.iconarrow)

        val bundle = intent.extras
        val dato = bundle?.getInt("opcion")
        Toast.makeText(this, ""+dato, Toast.LENGTH_SHORT).show()

        if (dato != null) {
            getitem(dato)
        }

        imgviewarrow.setOnClickListener {
            // your code here
            val intent = Intent(this, Component::class.java)
            startActivity(intent)
        }
    }

    private fun getitem(dato: Int)
    {
        if(dato == 1)
        {
            val cpuNames = DataSourcecpu().loadNames()
            val cpuPrices = DataSourcecpu().loadPrices()
            val cpuImages = DataSourcecpu().loadImages()

            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            recyclerView.adapter = itemAdapter2(this, cpuNames, cpuPrices, cpuImages)

            recyclerView.setHasFixedSize(true)

        }
        if(dato == 2)
        {
            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            val moboNames = DataSourceMobo().loadNames()
            val moboPrices = DataSourceMobo().loadPrices()
            val moboImages = DataSourceMobo().loadImages()

            recyclerView.adapter = itemAdapter2(this, moboNames, moboPrices, moboImages)
            recyclerView.setHasFixedSize(true)
        }

        if(dato == 3)
        {
            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            val gpuNames = DataSourceGpu().loadNames()
            val gpuPrices = DataSourceGpu().loadPrices()
            val gpuImages = DataSourceGpu().loadImages()

            recyclerView.adapter = itemAdapter2(this, gpuNames, gpuPrices, gpuImages)
            recyclerView.setHasFixedSize(true)
        }
        if(dato == 4)
        {
            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            val storageNames = DataSourceStorage().loadNames()
            val storagePrices = DataSourceStorage().loadPrices()
            val storageImages = DataSourceStorage().loadImages()

            recyclerView.adapter = itemAdapter2(this, storageNames, storagePrices, storageImages)
            recyclerView.setHasFixedSize(true)
        }
        if(dato == 5)
        {
            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            val powerNames = DataSourcePower().loadNames()
            val powerPrices = DataSourcePower().loadPrices()
            val powerImages = DataSourcePower().loadImages()

            recyclerView.adapter = itemAdapter2(this, powerNames, powerPrices, powerImages)
            recyclerView.setHasFixedSize(true)
        }
        if (dato == 6)
        {
            val ramNames = DataSourceRam().loadNames()
            val ramPrices = DataSourceRam().loadPrices()
            val ramImages = DataSourceRam().loadImages()

            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            recyclerView.adapter = itemAdapter2(this, ramNames, ramPrices, ramImages)

            recyclerView.setHasFixedSize(true)
        }
        if (dato == 7)
        {
            val caseNames = DataSourceCase().loadNames()
            val casePrices = DataSourceCase().loadPrices()
            val caseImages = DataSourceCase().loadImages()

            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            recyclerView.adapter = itemAdapter2(this, caseNames, casePrices, caseImages)
            recyclerView.setHasFixedSize(true)
        }
        if(dato == 8)
        {
            val fanNames = DataSourceFan().loadNames()
            val fanPrices = DataSourceFan().loadPrices()
            val fanImages = DataSourceFan().loadImages()

            val recyclerView = findViewById<RecyclerView>(R.id.list_of_items)
            recyclerView.adapter = itemAdapter2(this, fanNames, fanPrices, fanImages)

            recyclerView.setHasFixedSize(true)
        }
    }
}