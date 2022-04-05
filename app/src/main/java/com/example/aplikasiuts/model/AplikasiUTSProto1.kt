package com.example.aplikasiuts.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class AplikasiUTSProto1(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    ) {
}