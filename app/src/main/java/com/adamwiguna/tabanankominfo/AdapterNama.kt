package com.adamwiguna.tabanankominfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_nama.view.*

class AdapterNama(private val listName : List<String>,
                  private val listDate : List<String>,
                  private val listImage : IntArray)
      :RecyclerView.Adapter<AdapterNama.ViewHolder>() {
    class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
        val nama = view.itemNama
        val tanggal = view.itemTanggal
        val gambar = view.itemGambar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNama.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_nama, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AdapterNama.ViewHolder, position: Int) {
        holder.nama.text = listName[position]
        holder.tanggal.text = listDate[position]
        holder.gambar.setImageResource(listImage[position])
    }

    override fun getItemCount(): Int {
        return listName.size
    }
}