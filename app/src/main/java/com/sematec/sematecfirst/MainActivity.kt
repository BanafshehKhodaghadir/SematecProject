package com.sematec.sematecfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LifeCycle_debug", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle_debug", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle_debug", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle_debug", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle_debug", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle_debug", "onDestroy")
    }
}