package com.reeta.databinding.activityBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reeta.databinding.R
import com.reeta.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=DataBindingUtil.setContentView(this, R.layout.activity_main)

//        activityMainBinding.btnSetData.setOnClickListener {
//            val name=activityMainBinding.edtName.text.toString()
//            activityMainBinding.txtName.text=name
//        }
              //or we can declare like this also
        activityMainBinding.apply {
            btnSetData.setOnClickListener {
                val name=edtName.text.toString()
                user=User(name)
             //   txtName.text=name
            }
        }
    }
}
