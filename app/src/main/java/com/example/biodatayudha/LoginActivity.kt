package com.example.biodatayudha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.biodatayudha.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnToRegister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener{
            val username = binding.txtUsername.text.toString()
            val password = binding.txtUsername.text.toString()

            if(username.isEmpty()){
                binding.txtUsername.error = "Usernamenya isi dulu bang!"
                binding.txtUsername.requestFocus()
                return@setOnClickListener
            }

            if(username.length < 5){
                binding.txtUsername.error = "Username minimal 6 karakter"
                binding.txtUsername.requestFocus()
                return@setOnClickListener
            }

            if(password.isEmpty()){
                binding.txtUsername.error = "Passwordnya gaada bang?!"
                binding.txtUsername.requestFocus()
                return@setOnClickListener
            }

            if(password.length < 8){
                binding.txtUsername.error = "Passwordnya minimal 8 karakter"
                binding.txtUsername.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(username,password)
        }
    }

    private fun RegisterFirebase(username: String, password: String) {
        auth.createUserWithEmailAndPassword(username, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    val intent = Intent(this, Welcome::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "$ { it.exception?.message }", Toast.LENGTH_SHORT).show()
                }
            }
    }
}