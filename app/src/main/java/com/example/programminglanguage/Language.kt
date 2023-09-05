package com.example.programminglanguage

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Language(
    val imgLanguage: Int,
    val nameLanguage: String,
    val descLanguage: String
):Parcelable
