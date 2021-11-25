package com.adamwiguna.tabanankominfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_pengumuman.view.*

class AdapterPengumuman(private val listTitle : List<String>,
                        private val listDate : List<String>,
                        private val listImage : IntArray,
                        private val onclick : (Int)->Unit)
    : RecyclerView.Adapter<AdapterPengumuman.ViewHolder>() {

    class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
        val judul = view.itemJudul
        val tanggal = view.itemTanggal
        val gambar = view.itemGambar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPengumuman.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_pengumuman, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AdapterPengumuman.ViewHolder, position: Int) {
        holder.judul.text = listTitle[position]
        holder.tanggal.text = listDate[position]
        holder.gambar.setImageResource(listImage[position])
        holder.itemView.setOnClickListener{
            onclick(position)
        }
    }

    override fun getItemCount(): Int {
        return listTitle.size
    }
}