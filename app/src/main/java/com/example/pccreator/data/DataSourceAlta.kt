package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Item

class DataSourceAlta {
    fun loadNames(): List<Item> {
        return listOf<Item>(
            Item(R.string.juego1),
            Item(R.string.juego2),
            Item(R.string.juego3),
            Item(R.string.juego4),
            Item(R.string.juego5),
            Item(R.string.juego6),
            Item(R.string.juego7),
            Item(R.string.juego8),
            Item(R.string.juego9),
            Item(R.string.juego10),
            Item(R.string.Software1),
            Item(R.string.Software2),
            Item(R.string.Software3),
            Item(R.string.Software4),
            Item(R.string.Software5),
        )
    }
}