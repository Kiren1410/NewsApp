package com.kirenraj.ui.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.kirenraj.ui.viewmodel.LoginViewModel
import com.kirenraj.newsapp.R
import com.kirenraj.newsapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
//    private lateinit var binding: FragmentLoginBinding
//    private lateinit var viewModel: LoginViewModel
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = FragmentLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val email = findViewById<EditText>(R.id.etEmail)
//        val password = findViewById<EditText>(R.id.etPassword)
//        val signinbtn = findViewById<Button>(R.id.btnSignIn)
//
//        signinbtn.setOnClickListener {
//            val email = email.text.toString()
//            val password = password.text.toString()
//
//            if (email.isNotEmpty() && password.isNotEmpty()) {
//                // Retrieve stored username and password from shared preferences
//                val sharedPreferences = getSharedPreferences("MyPrefs",
//                    AppCompatActivity.MODE_PRIVATE
//                )
//                val storedEmail = sharedPreferences.getString("email", "")
//                val storedPassword = sharedPreferences.getString("password", "")
//
//                if (email == storedEmail && password == storedPassword) {
//                    val intent = Intent(this, LoginFragment::class.java)
//                    startActivity(intent)
////                    finish() // Prevents going back to the login screen
//                } else {
//                    Toast.makeText(this, "OOPS!, wrong email or password!", Toast.LENGTH_SHORT)
//                        .show()
//                }
//            } else {
//                Toast.makeText(this, "Please fill in all the fields!", Toast.LENGTH_SHORT).show()
//            }
//
//        }
//    }
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_login, container, false)
//    }
//
}