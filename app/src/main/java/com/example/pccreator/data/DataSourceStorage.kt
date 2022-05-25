package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceStorage {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.storage_1_name),
            Item(R.string.storage_2_name),
            Item(R.string.storage_3_name),
            Item(R.string.storage_4_name),
            Item(R.string.storage_5_name),
            Item(R.string.storage_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.storage_1_price),
            Item(R.string.storage_2_price),
            Item(R.string.storage_3_price),
            Item(R.string.storage_4_price),
            Item(R.string.storage_5_price),
            Item(R.string.storage_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.hdd500gb),
            Image(R.drawable.hdd1tb),
            Image(R.drawable.hdd2tb),
            Image(R.drawable.ssd500gb),
            Image(R.drawable.ssd1tb),
            Image(R.drawable.ssd2tb)
        )
    }
}