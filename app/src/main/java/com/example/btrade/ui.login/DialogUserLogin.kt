package com.example.btrade.ui.login
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.btrade.databinding.UserLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class DialogUserLogin : DialogFragment(), View.OnClickListener {
    private lateinit var binding: UserLoginBinding
    private lateinit var auth:FirebaseAuth
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = UserLoginBinding.inflate(layoutInflater)
        auth = Firebase.auth
        val builder = AlertDialog.Builder(this.requireActivity())
        builder.setView(binding.root)
        binding.btnLoginCheck.setOnClickListener(this)
        return builder.create()
    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.btnLoginCheck.id -> {
                val email:String = binding.edtEmailLogin.text.toString()
                val pass:String = binding.edtPassword.text.toString()
                if (validate(email, pass)){
                    auth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener {
                            if (it.isSuccessful){
                                Toast.makeText(view.context, "Success", Toast.LENGTH_SHORT).show()
                                dismiss()
                            }else{
                                Toast.makeText(view.context, "Invalid Credentials", Toast.LENGTH_SHORT).show()

                            }
                        }
                }
            }
        }
    }
    private fun validate(email:String?, pass:String?):Boolean{
        if (email.isNullOrBlank() or pass.isNullOrBlank()){
            Toast.makeText(this.context, "Empty Fields", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }


}