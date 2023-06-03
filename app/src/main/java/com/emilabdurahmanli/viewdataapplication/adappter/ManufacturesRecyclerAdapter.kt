package com.emilabdurahmanli.viewdataapplication.adappter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.emilabdurahmanli.viewdataapplication.databinding.ManufactureRecyclerRowBinding
import com.emilabdurahmanli.viewdataapplication.model.Manufactures

class ManufacturesRecyclerAdapter(var list : List<Manufactures>)  : RecyclerView.Adapter<ManufacturesRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(var binding : ManufactureRecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ManufactureRecyclerRowBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.countryText.text = list[position].Country
        holder.binding.mfrCommonName.text = list[position].Mfr_CommonName
        holder.binding.mfrName.text = list[position].Mfr_Name
    }


}