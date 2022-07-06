package com.example.mapleak

import android.app.Application
import com.google.android.gms.maps.MapsInitializer
import timber.log.Timber

class MapLeakApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        MapsInitializer.initialize(
            applicationContext,
            MapsInitializer.Renderer.LATEST
        ) { renderer ->
            when (renderer) {
                MapsInitializer.Renderer.LATEST -> Timber.d("Using LATEST maps renderer")
                MapsInitializer.Renderer.LEGACY -> Timber.d("Using LEGACY maps renderer")
            }
        }
    }

}