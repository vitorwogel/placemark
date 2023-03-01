package com.example.labproject.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlacemarkModel(var id: Long = 0,
                          var title: String = "",
                          var description: String = "") : Parcelable

