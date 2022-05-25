package com.example.pccreator.data

import com.example.pccreator.R
import com.example.pccreator.model.Build

class Datasource() {
    fun loadBuilds(): List<Build>
    {
        return listOf<Build>(
            Build(R.string.Build1, R.drawable.case6, R.string.Precio1),
            Build(R.string.Build2, R.drawable.case4, R.string.Precio2),
            Build(R.string.Build3, R.drawable.case1, R.string.Precio3),
                )
    }
}