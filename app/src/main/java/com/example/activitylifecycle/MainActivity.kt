package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LifeCycle", "onCreate() initiated")
        showToast("onCreate() initiated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onStart() initiated")
        showToast("onStart() initiated")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume() initiated")
        showToast("onResume() initiated")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause() initiated")
        showToast("onPause() initiated")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop() initiated")
        showToast("onStop() initiated")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onRestart() initiated")
        showToast("onRestart() initiated")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy() initiated")
        showToast("onDestroy() initiated")
    }



    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
