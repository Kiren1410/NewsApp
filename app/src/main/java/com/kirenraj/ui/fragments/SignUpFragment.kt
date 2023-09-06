package com.kirenraj.ui.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.FragmentContainer
import com.google.android.gms.tagmanager.Container
import com.google.firebase.auth.FirebaseAuth
import com.kirenraj.ui.viewmodel.SignUpViewModel
import com.kirenraj.newsapp.R
import com.kirenraj.newsapp.databinding.FragmentSignUpBinding
import java.util.zip.Inflater

class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnSignUp.setOnClickListener {
            val username = binding.username.text.toString()
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty()) {

                firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        // Fragment transactions are used to navigate between fragments
                        val loginFragment = LoginFragment()
                        val transaction = requireActivity().supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.btnSignUp, loginFragment)
                        transaction.addToBackStack(null)
                        transaction.commit()
                    }
                }

            } else {
                Toast.makeText(requireContext(), "Please fill all the blank", Toast.LENGTH_SHORT).show()
            }
        }
    }
}