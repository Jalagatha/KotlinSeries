package com.ivanj.kotlinseries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.ivanj.kotlinseries.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var usernameL:TextInputEditText
    private lateinit var passL:TextInputEditText
    private lateinit var loginL:Button
    private lateinit var noAccount:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        usernameL=binding.username
        loginL=binding.btnLogin
        passL=binding.password
        noAccount=binding.noAccount
        noAccount.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
            finish()
        }

        loginL.setOnClickListener {
            performLogin()
        }
    }

    private fun performLogin() {
        val pass=passL.text.toString()
        val email=usernameL.text.toString()
        if (pass=="1234"&&email=="kotlinseries@gmail.com"){
            val intent=Intent(this,MainActivity::class.java)
            Toast.makeText(this,"Your Welcome to Kotlin Series 2023",Toast.LENGTH_LONG).show()
            startActivity(intent)
        }else{
            Toast.makeText(this,"enter Correct email or Password",Toast.LENGTH_LONG).show()
            usernameL.requestFocus()

        }

    }
}