package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourcePower {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.power_1_name),
            Item(R.string.power_2_name),
            Item(R.string.power_3_name),
            Item(R.string.power_4_name),
            Item(R.string.power_5_name),
            Item(R.string.power_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.power_1_price),
            Item(R.string.power_2_price),
            Item(R.string.power_3_price),
            Item(R.string.power_4_price),
            Item(R.string.power_5_price),
            Item(R.string.power_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.p500w),
            Image(R.drawable.p600w),
            Image(R.drawable.p650w),
            Image(R.drawable.p700w),
            Image(R.drawable.p750w),
            Image(R.drawable.p850w)
        )
    }
}