package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val task = arrayListOf<String>()
        task.add("AVisit Hunaman Mandir on monday ")
        task.add("Buy book")
        task.add("Work on Internet")
        task.add("Workk on resume")
        task.add("Buy bhindi From market")

        val adapterformylistview=ArrayAdapter(this,android.R.layout.simple_list_item_1,task)
        binding.listview.adapter= adapterformylistview // it is for acces my list


        // for function from all task
        binding.listview.setOnItemClickListener{ parent,view,postion,id ->

            val text ="Clicked on item :" + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_LONG).show()
        }
    }
}