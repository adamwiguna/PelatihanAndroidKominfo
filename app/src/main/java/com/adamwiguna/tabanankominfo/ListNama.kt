package com.adamwiguna.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*

class ListNama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val names = listOf<String>(
            "Adam",
            "Ogix",
            "Yudi",
            "Candra",
            "Hendra",
            "Agus",
            "Bli Putu",
            "Bli Adi",
            "Geg Ari"
        )

        val tanggalLahir = listOf<String>(
            "01-01-2021",
            "02-02-2021",
            "03-03-2021",
            "04-04-2021",
            "05-05-2021",
            "06-06-2021",
            "07-07-2021",
            "08-08-2021",
            "09-09-2021"
        )

        val images = intArrayOf(
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
            R.drawable.gambar,
        )

        val adapternama = AdapterNama(names, tanggalLahir, images)
        recycleViewNama.layoutManager = LinearLayoutManager(this)
        recycleViewNama.adapter = adapternama

    }
}