package com.reeta.databinding.recyclerViewBinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.reeta.databinding.R
import com.reeta.databinding.databinding.ActivityRecydlerBinding
import com.reeta.databinding.databinding.RecyclerLayoutBinding

class NameAdapter(var list:ArrayList<PersonDetails>,var listner: ClickListner):RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
       val layoutInflater=LayoutInflater.from(parent.context)
        val recyclerLayoutBinding:RecyclerLayoutBinding=DataBindingUtil.inflate(layoutInflater,R.layout.recycler_layout,parent,false)
        return NameViewHolder(recyclerLayoutBinding,listner)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        var nameList=list[position]
        holder.setData(nameList)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    class NameViewHolder(var binding: RecyclerLayoutBinding,var listner: ClickListner):
        RecyclerView.ViewHolder(binding.root){
        init {
            binding.listner=listner
        }
       fun setData(details: PersonDetails){
       //    binding.listner=listner
           binding.details=details
       }
        }

}