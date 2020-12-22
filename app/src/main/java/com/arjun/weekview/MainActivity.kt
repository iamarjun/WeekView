package com.arjun.weekview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arjun.weekview.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewpager.adapter = WeekViewAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, pos ->
            when(pos) {
                0 -> tab.text = "One"
                1 -> tab.text = "Two"
                2 -> tab.text = "Three"
            }
        }.attach()

    }
}