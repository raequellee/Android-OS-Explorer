package com.example.tugaskelompok1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    // Ngatur urutan halaman
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SejarahFragment()    // Halaman pertama (0)
            1 -> ArsitekturFragment() // Halaman kedua (1)
            else -> SejarahFragment()
        }
    }
}