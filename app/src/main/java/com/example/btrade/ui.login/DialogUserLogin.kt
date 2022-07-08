package com.example.btrade.ui.login
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.btrade.databinding.UserLoginBinding

class DialogUserLogin : DialogFragment() {
    private lateinit var binding: UserLoginBinding
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = UserLoginBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this.requireActivity())
        builder.setView(binding.root)

        return builder.create()
    }

}