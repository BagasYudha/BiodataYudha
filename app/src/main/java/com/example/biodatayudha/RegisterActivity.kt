package com.example.biodatayudha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.biodatayudha.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRegisterBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener{
            val email = binding.txtUsername.text.toString()
            val password = binding.txtUsername.text.toString()

            if(email.isEmpty()){
                binding.txtUsername.error = "Usernamenya isi dulu bang!"
                binding.txtUsername.requestFocus()
                return@setOnClickListener
            }

            if(email.length < 5){
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
            registerFirebase(email,password)
        }
    }

    private fun registerFirebase(username: String, password: String) {
        auth.createUserWithEmailAndPassword(username,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }

    }
}