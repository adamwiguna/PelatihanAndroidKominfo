package com.adamwiguna.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*

class DetailPengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengumuman)

        val dataJudul = intent.getStringExtra("judul")
        val dataTanggal = intent.getStringExtra("tanggal")
        val dataGambar = intent.getIntExtra("gambar",0)

        judul.text = dataJudul.toString()
        gambar.setImageResource(dataGambar)
        tanggal.text = dataTanggal.toString()

    }
}