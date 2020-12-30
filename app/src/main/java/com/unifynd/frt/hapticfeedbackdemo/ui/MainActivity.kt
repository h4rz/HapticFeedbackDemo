package com.unifynd.frt.hapticfeedbackdemo.ui

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.immersion.uhl.Launcher
import com.unifynd.frt.hapticfeedbackdemo.adapter.HapticAdapter
import com.unifynd.frt.hapticfeedbackdemo.databinding.ActivityMainBinding
import com.unifynd.frt.hapticfeedbackdemo.utils.Constants

class MainActivity : AppCompatActivity() {

    private lateinit var myContext: Context
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        myContext = this
        setupImmersionsHapticFeedback()
    }

    private fun setupImmersionsHapticFeedback() {
        val viewAdapter = HapticAdapter(Constants.ImmersionHapticsMapping.values(), Launcher(myContext), myContext)
        val viewManger = GridLayoutManager(myContext, 4, GridLayoutManager.VERTICAL, false)
        binding.rvHapticFeedback.apply {
            setHasFixedSize(true)
            adapter = viewAdapter
            layoutManager = viewManger
        }
    }

}