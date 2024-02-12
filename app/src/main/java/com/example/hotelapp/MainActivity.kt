package com.example.hotelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = MyPagerAdapter(this)
        binding.viewPager2.adapter = adapter


        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = when(position) {
                0 -> "Hotels"
                1 -> "Favorite"
                else -> null
            }
        }.attach()
    }
}