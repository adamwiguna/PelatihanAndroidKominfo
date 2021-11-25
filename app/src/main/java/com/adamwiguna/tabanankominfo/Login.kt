package com.adamwiguna.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            val username1 = username.text.toString()
            val password1 = password.text.toString()
            if(username1.isEmpty()){
                username.setError("Masukkan username terlebih dahulu")
            }else if(password1.isEmpty()){
                password.setError("Password Kosong!!")
            }else if(username1 != "adamw" || password1 != "1234"){
                Toast.makeText(this, "username dan username salah", Toast.LENGTH_LONG).show()
            }else if(username1=="adamw" && password1=="1234"){
                val data = Intent(this, MainActivity::class.java)
                data.putExtra("username", username1)
                startActivity(data)
            }
        }

    }
}