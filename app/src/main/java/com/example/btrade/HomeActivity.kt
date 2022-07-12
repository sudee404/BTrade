package com.example.btrade

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btrade.databinding.ActivityHome1Binding
import com.example.btrade.ui.login.DialogUserLogin
import com.example.btrade.ui.login.DialogUserRegister

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHome1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHome1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val dialog = DialogUserLogin()
            dialog.show(supportFragmentManager,"")
        }
        binding.btnRegister.setOnClickListener {
            val dialog = DialogUserRegister()
            dialog.show(supportFragmentManager,"")
        }
    }
}