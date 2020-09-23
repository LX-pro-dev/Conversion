package com.gauthier.conversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gauthier.conversion.ui.main.MainFragment
import com.gauthier.conversion.databinding.MainFragmentBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            //chargement des fragments
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}