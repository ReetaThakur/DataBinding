package com.reeta.databinding.fragmentBinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.reeta.databinding.R
import com.reeta.databinding.activityBinding.User
import com.reeta.databinding.databinding.FragmentSampleBinding

class SampleFragment : Fragment(R.layout.fragment_sample) {

    lateinit var fragmentSampleBinding: FragmentSampleBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSampleBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_sample,container,false)
         return fragmentSampleBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentSampleBinding.apply {
            btnSetName.setOnClickListener {
                var surname= etEnterName.text.toString()
                name=User(surname)
            }
        }
        var user=User("Masai School")
        fragmentSampleBinding.tvName.text=user.name
    }
}