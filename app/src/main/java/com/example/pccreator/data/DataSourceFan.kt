package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceFan {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.fan_1_name),
            Item(R.string.fan_2_name),
            Item(R.string.fan_3_name),
            Item(R.string.fan_4_name),
            Item(R.string.fan_5_name),
            Item(R.string.fan_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.fan_1_price),
            Item(R.string.fan_2_price),
            Item(R.string.fan_3_price),
            Item(R.string.fan_4_price),
            Item(R.string.fan_5_price),
            Item(R.string.fan_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.fan1),
            Image(R.drawable.fan2),
            Image(R.drawable.fan3),
            Image(R.drawable.fan4),
            Image(R.drawable.fan5),
            Image(R.drawable.fan6)
        )
    }
}