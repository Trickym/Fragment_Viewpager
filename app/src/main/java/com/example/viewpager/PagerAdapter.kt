package com.example.viewpager

import android.content.res.Resources
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return return when(position){
            0-> Fragment1()
            1-> Fragment2()
            2-> Fragment3()
            else-> throw Resources.NotFoundException("sss")
        }
    }

}