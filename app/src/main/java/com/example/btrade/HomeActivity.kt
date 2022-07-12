package com.example.btrade

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btrade.databinding.ActivityHome1Binding
import com.example.btrade.ui.login.DialogUserLogin
import com.example.btrade.ui.login.DialogUserRegister
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHome1Binding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHome1Binding.inflate(layoutInflater)
        auth = Firebase.auth
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