package ru.popovich.app02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String? = "MainActivity"
    private var field: String? = "one"

    override fun onCreate(outState: Bundle?) {
        super.onCreate(outState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
        Log.d(TAG,outState?.getString("keysave").toString())
    }

    override fun onRestoreInstanceState(outState: Bundle) {
        field = outState.getString("keysave")
        Log.d(TAG,"onRestoreIS")
        Log.d(TAG, "field restor: "+ field)
        super.onRestoreInstanceState(outState)
    }



    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("keysave",field)
        Log.d(TAG,"onSaveIS")
        Log.d(TAG, "field save: "+ field)
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")

        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }
}