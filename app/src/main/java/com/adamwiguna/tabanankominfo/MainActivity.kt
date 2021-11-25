package com.adamwiguna.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("username")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, FragmentHome.newInstance("$username"))
            .commit()

        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuhome->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentHome.newInstance("$username"))
                        .commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menuweb->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentWeb())
                        .commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menuprofile->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentProfile())
                        .commit()
                    return@setOnItemSelectedListener true
                }
            }

            return@setOnItemSelectedListener false
        }
    }
}