package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceRam {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.ram_1_name),
            Item(R.string.ram_2_name),
            Item(R.string.ram_3_name),
            Item(R.string.ram_4_name),
            Item(R.string.ram_5_name),
            Item(R.string.ram_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.ram_1_price),
            Item(R.string.ram_2_price),
            Item(R.string.ram_3_price),
            Item(R.string.ram_4_price),
            Item(R.string.ram_5_price),
            Item(R.string.ram_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.ram4gb),
            Image(R.drawable.ram4gbdual),
            Image(R.drawable.ram8gb),
            Image(R.drawable.ram8gbdual),
            Image(R.drawable.ram16gb),
            Image(R.drawable.ram16gbdual)
        )
    }
}