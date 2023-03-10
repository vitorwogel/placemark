package com.example.labproject.main

import android.app.Application
import com.example.labproject.models.PlacemarkMemStore
import com.example.labproject.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    val placemarks = PlacemarkMemStore()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
    }
}
