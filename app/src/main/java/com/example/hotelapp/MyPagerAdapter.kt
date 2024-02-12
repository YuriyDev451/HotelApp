package com.example.hotelapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.favorite.FavoriteFragment
import com.example.hotels.HotelsFragment

class MyPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> HotelsFragment()
            1 -> FavoriteFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

}