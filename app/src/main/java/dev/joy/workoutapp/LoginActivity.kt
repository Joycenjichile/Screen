package dev.joy.workoutapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.joy.workoutapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            validityPerson()

        }
//        tvSignup.setOnClickListener {
//         val intent=Intent(this,SignupActivity::class.java)
//            startActivity(intent)

    }

    fun validityPerson() {
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error = "Email required"
            error = true


        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password required"
            error = true

        }
        if (!error) {
            startActivity(Intent(this, homeActivity::class.java))
            finish()
        }
    }


}
