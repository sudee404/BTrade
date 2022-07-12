package com.example.btrade.ui.login

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.btrade.databinding.UserRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class DialogUserRegister : DialogFragment(), View.OnClickListener {
    private lateinit var binding: UserRegisterBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = UserRegisterBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this.requireActivity())
        auth = Firebase.auth
        builder.setView(binding.root)
        binding.btnRegisterCheck.setOnClickListener (this)
        return builder.create()
    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.btnRegisterCheck.id -> {
                val username:String = binding.edtUsername.text.toString()
                val email:String = binding.edtEmail.text.toString()
                val pass:String = binding.edtPassword.text.toString()
                val pass1:String = binding.edtPassword2.text.toString()

                if (validate(username,email,pass,pass1)){
                    auth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful){
                                auth.signInWithEmailAndPassword(email,pass)
                                    .addOnCompleteListener {
                                        if (task.isSuccessful){
                                            Toast.makeText(view.context, "Success", Toast.LENGTH_SHORT).show()
                                            dismiss()
                                        }
                                    }


                            }else{
                                Toast.makeText(view.context, "Email already exists", Toast.LENGTH_SHORT).show()

                            }
                        }
                }

            }
        }
    }
    private fun validate(username:String?,email:String?, pass:String?, pass1:String?):Boolean{
        if ((email.isNullOrBlank() or email.isNullOrEmpty())){
            Toast.makeText(this.context, "Enter Email", Toast.LENGTH_SHORT).show()
        }else if (username.isNullOrBlank() or username.isNullOrEmpty()){
            Toast.makeText(this.context, "Enter Username", Toast.LENGTH_SHORT).show()
        }else if (pass.isNullOrBlank() or pass.isNullOrEmpty()){
            Toast.makeText(this.context, "Enter Password", Toast.LENGTH_SHORT).show()
        }else if (pass1.isNullOrBlank() or pass1.isNullOrEmpty()){
            Toast.makeText(this.context, "Confirm Password", Toast.LENGTH_SHORT).show()
        }else if (pass != pass1){
            Toast.makeText(this.context, "The two passwords should be identical", Toast.LENGTH_SHORT).show()
        }else{
            return true
        }
        return false
    }

}