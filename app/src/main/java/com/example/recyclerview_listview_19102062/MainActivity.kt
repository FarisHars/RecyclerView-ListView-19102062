package com.example.recyclerview_listview_19102062

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_listview_19102062.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("19102062", "Faris Abyan Harits", "0895330728639"),
            MyContact("19102143", "Yanto Kusumo", "0892468956232"),
            MyContact("19104234", "Heri Suwandi", "0857425436434"),
            MyContact("19103463", "Yuda Kunandi", "0895879658955"),
            MyContact("19187654", "Soleh Hafiz", "0896547689066"),
            MyContact("19146852", "Rizki Ahmad Dani", "0812345768478"),
            MyContact("19145645", "Muhammad Arkan Yuda", "0895314231343"),
        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}