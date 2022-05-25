package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourcecpu {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.cpu_1_name),
            Item(R.string.cpu_2_name),
            Item(R.string.cpu_3_name),
            Item(R.string.cpu_4_name),
            Item(R.string.cpu_5_name),
            Item(R.string.cpu_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.cpu_1_price),
            Item(R.string.cpu_2_price),
            Item(R.string.cpu_3_price),
            Item(R.string.cpu_4_price),
            Item(R.string.cpu_5_price),
            Item(R.string.cpu_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.i5),
            Image(R.drawable.ixeon),
            Image(R.drawable.ryzen5),
            Image(R.drawable.ratlhon),
            Image(R.drawable.r3390x),
            Image(R.drawable.icelereon)
        )
    }
}