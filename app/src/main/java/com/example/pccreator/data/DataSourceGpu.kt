package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class DataSourceGpu {
    fun loadNames():List<Item> {
        return listOf<Item>(
            Item(R.string.gpu_1_name),
            Item(R.string.gpu_2_name),
            Item(R.string.gpu_3_name),
            Item(R.string.gpu_4_name),
            Item(R.string.gpu_5_name),
            Item(R.string.gpu_6_name)
        )
    }

    fun loadPrices():List<Item>{
        return listOf<Item>(
            Item(R.string.gpu_1_price),
            Item(R.string.gpu_2_price),
            Item(R.string.gpu_3_price),
            Item(R.string.gpu_4_price),
            Item(R.string.gpu_5_price),
            Item(R.string.gpu_6_price)

        )
    }

    fun loadImages():List<Image>{
        return listOf<Image>(
            Image(R.drawable.gtx1050ti),
            Image(R.drawable.gtx1060ti),
            Image(R.drawable.gtx1660ti),
            Image(R.drawable.rtx2060super),
            Image(R.drawable.rtx3050),
            Image(R.drawable.rtx3060ti)
        )
    }
}