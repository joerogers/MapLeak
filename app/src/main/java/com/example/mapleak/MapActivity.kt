package com.example.mapleak

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        findViewById<Button>(R.id.closeButton).setOnClickListener {
            finishAfterTransition()
        }

        val frag = supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        frag.getMapAsync {
            it.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(47.6062, -122.3321), 15f))
        }
    }
}