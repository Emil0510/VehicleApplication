package com.emilabdurahmanli.viewdataapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.emilabdurahmanli.viewdataapplication.R
import com.emilabdurahmanli.viewdataapplication.adappter.ManufacturesRecyclerAdapter
import com.emilabdurahmanli.viewdataapplication.databinding.ActivityMainBinding
import com.emilabdurahmanli.viewdataapplication.view_model.MainActivityVM

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainActivityVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.manufactureRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        viewModel = ViewModelProvider(this)[MainActivityVM::class.java]
        viewModel.getAllManufactures()
        viewModel.observeResult().observe(this, Observer { result ->
            binding.manufactureRecyclerView.adapter = ManufacturesRecyclerAdapter(result.Results)
        })

    }
}