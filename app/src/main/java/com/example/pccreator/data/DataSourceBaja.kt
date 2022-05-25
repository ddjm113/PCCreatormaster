package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Item

class DataSourceBaja {
    fun loadNames(): List<Item> {
        return listOf<Item>(
            Item(R.string.juego6),
            Item(R.string.juego7),
            Item(R.string.juego8),
            Item(R.string.Software4),
            Item(R.string.Software5),
        )
    }
}