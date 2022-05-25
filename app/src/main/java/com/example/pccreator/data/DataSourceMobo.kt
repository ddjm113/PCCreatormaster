package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceMobo {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.mobo_1_name),
            Item(R.string.mobo_2_name),
            Item(R.string.mobo_3_name),
            Item(R.string.mobo_4_name),
            Item(R.string.mobo_5_name),
            Item(R.string.mobo_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.mobo_1_price),
            Item(R.string.mobo_2_price),
            Item(R.string.mobo_3_price),
            Item(R.string.mobo_4_price),
            Item(R.string.mobo_5_price),
            Item(R.string.mobo_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.ga320m),
            Image(R.drawable.asusz590),
            Image(R.drawable.gb450),
            Image(R.drawable.gb560m),
            Image(R.drawable.arogz690),
            Image(R.drawable.ab550)
        )
    }
}