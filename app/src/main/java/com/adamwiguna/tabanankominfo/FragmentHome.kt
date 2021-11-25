package com.adamwiguna.tabanankominfo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name.text = param1

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
            val data = Intent(context, DetailPengumuman::class.java)
            data.putExtra("judul", judulPengumuman.get(it))
            data.putExtra("tanggal", tanggalPengumuman.get(it))
            data.putExtra("gambar", images.get(it))
            startActivity(data)
        }
        recycleViewPengumuman.layoutManager = LinearLayoutManager(context)
        recycleViewPengumuman.adapter = adapterpengumuman
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            FragmentHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}