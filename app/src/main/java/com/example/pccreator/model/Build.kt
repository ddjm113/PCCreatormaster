package com.example.pccreator.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Build(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val valueResourceId: Int)