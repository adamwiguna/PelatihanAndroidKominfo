package com.adamwiguna.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*

class ListPengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pengumuman)

        val judulPengumuman = listOf<String>(
            "Judul Pengumuman 1",
            "Judul Pengumuman 2",
            "Judul Pengumuman 3",
            "Judul Pengumuman 4",
            "Judul Pengumuman 5",
            "Judul Pengumuman 6",
            "Judul Pengumuman 7",
            "Judul Pengumuman 8",
            "Judul Pengumuman 9",
        )

        val tanggalPengumuman = listOf<String>(
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
            R.drawable.ic_launcher_background,
            R.drawable.ic_baseline_person_24,
            R.drawable.ic_baseline_comment_24,
            R.drawable.ic_baseline_web_24,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_baseline_group_add_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.gambar,
        )

        val adapterpengumuman = AdapterPengumuman(judulPengumuman, tanggalPengumuman, images){
            val data = Intent(this, DetailPengumuman::class.java)
            data.putExtra("judul", judulPengumuman.get(it))
            data.putExtra("tanggal", tanggalPengumuman.get(it))
            data.putExtra("gambar", images.get(it))
            startActivity(data)
        }
        recycleViewNama.layoutManager = LinearLayoutManager(this)
        recycleViewNama.adapter = adapterpengumuman

    }
}