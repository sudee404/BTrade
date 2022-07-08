package com.example.btrade.ui.login

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.btrade.databinding.UserRegisterBinding


class DialogUserRegister : DialogFragment() {
    private lateinit var binding: UserRegisterBinding
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = UserRegisterBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this.requireActivity())
        builder.setView(binding.root)
        binding.btnRegisterCheck.setOnClickListener {

//            val user = User()
//            user.uname = binding.edtUsername.text.toString()
//            user.email = binding.edtEmail.text.toString()
//            user.pass = binding.edtPassword.text.toString()
//            (activity as MainActivity?)?.createUser(user)
            dismiss()
        }
        return builder.create()
    }

}