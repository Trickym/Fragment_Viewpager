package com.example.viewpager

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tab)
        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = PagerAdapter(this)
        Log.d("","${viewPager.adapter}")
        TabLayoutMediator(tabLayout,viewPager){
            tab,index->
            tab.text = when(index){
                0->{"First"}
                1->{"Second"}
                2->{"Third"}
                else->{throw Resources.NotFoundException("Page Not Found")}
            }
        }.attach()
    }
}