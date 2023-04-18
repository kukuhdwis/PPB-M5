package com.example.modul5pt1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable(
    val fotomhs: Int = 0,
    val Nimmhs: String,
    val Namamhs: String,
    val Telp: String
) : Parcelable
