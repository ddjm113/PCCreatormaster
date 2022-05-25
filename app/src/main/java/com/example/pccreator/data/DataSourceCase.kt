package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceCase {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.case_1_name),
            Item(R.string.case_2_name),
            Item(R.string.case_3_name),
            Item(R.string.case_4_name),
            Item(R.string.case_5_name),
            Item(R.string.case_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.case_1_price),
            Item(R.string.case_2_price),
            Item(R.string.case_3_price),
            Item(R.string.case_4_price),
            Item(R.string.case_5_price),
            Item(R.string.case_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.case1),
            Image(R.drawable.case2),
            Image(R.drawable.case3),
            Image(R.drawable.case4),
            Image(R.drawable.case5),
            Image(R.drawable.case6)
        )
    }
}