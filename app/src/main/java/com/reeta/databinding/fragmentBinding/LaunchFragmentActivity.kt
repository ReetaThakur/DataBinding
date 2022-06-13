package com.reeta.databinding.fragmentBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reeta.databinding.R
import com.reeta.databinding.databinding.ActivityLaunchFragmentBinding

class LaunchFragmentActivity : AppCompatActivity() {

    lateinit var activityLaunchFragment: ActivityLaunchFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLaunchFragment=DataBindingUtil.setContentView(this,R.layout.activity_launch_fragment)
        launchFragment()
    }

    private fun launchFragment() {
        val sampleFragment=SampleFragment()
        val transaction=supportFragmentManager.beginTransaction()
        transaction.add(activityLaunchFragment.frmContainer.id,sampleFragment,"fragment").commit()
    }
}