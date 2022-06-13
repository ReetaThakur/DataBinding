package com.reeta.databinding.recyclerViewBinding

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.reeta.databinding.R
import com.reeta.databinding.databinding.ActivityRecydlerBinding

class RecyclerActivity : AppCompatActivity(),ClickListner {

    lateinit var recyclerActivityBinding:ActivityRecydlerBinding
    var detailsList=ArrayList<PersonDetails>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerActivityBinding=DataBindingUtil.setContentView(this,R.layout.activity_recydler)
        setData()
        setAdapter()
    }

    private fun setAdapter() {
        val nameAdapter=NameAdapter(detailsList,this)
        val linearLayoutManager=LinearLayoutManager(this)
        recyclerActivityBinding.recyclerView.apply {
            layoutManager=linearLayoutManager
            adapter=nameAdapter
        }
    }

    private fun setData() {
        for (i in 1..20) {
            detailsList.add(PersonDetails("reeta", "Thakur"))
            detailsList.add(PersonDetails("Rupali", "Tiwari"))
            detailsList.add(PersonDetails("Shailee", "Shrivastva"))
            detailsList.add(PersonDetails("Ritu", "Kumari"))
            detailsList.add(PersonDetails("Sapna", "Vishkarma"))

        }
    }

    override fun click(personDetails: PersonDetails) {
        Toast.makeText(this,"${personDetails.name} and ${personDetails.surname}",Toast.LENGTH_SHORT).show()
    }
}