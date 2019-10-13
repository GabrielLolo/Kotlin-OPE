package br.com.gabriellolo.carvalhoodonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class DebugActivity : AppCompatActivity() {

    private val TAG = "CarvalhoOdonto"
    private val className: String
        get(){
            val s = javaClass.name
            //s == br.com.gabriellolo.carvalhoodonto.DebugActivity
            return s.substring(s.lastIndexOf("."))
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "$className.onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$className.onStart()")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "$className.onResume()")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, "$className.onRestart()")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "$className.onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$className.onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$className.onDestroy()")
    }



}
