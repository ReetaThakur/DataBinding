package com.reeta.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reeta.databinding.activityBinding.MainActivity
import com.reeta.databinding.databinding.ActivityMainLaunchBinding
import com.reeta.databinding.fragmentBinding.LaunchFragmentActivity
import com.reeta.databinding.recyclerViewBinding.RecyclerActivity

class MainLaunchActivity : AppCompatActivity() {
    lateinit var activityMainLaunchBinding: ActivityMainLaunchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainLaunchBinding=DataBindingUtil.setContentView(this,R.layout.activity_main_launch)

        activityMainLaunchBinding.apply {
            btnActivity.setOnClickListener {
                val intent=Intent(this@MainLaunchActivity,MainActivity::class.java)
                startActivity(intent)
            }
            btnFragment.setOnClickListener {
                val intent=Intent(this@MainLaunchActivity,LaunchFragmentActivity::class.java)
                startActivity(intent)
            }
            btnRecyclerView.setOnClickListener {
                val intent=Intent(this@MainLaunchActivity,RecyclerActivity::class.java)
                startActivity(intent)
            }
        }
    }
}