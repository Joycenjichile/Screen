package dev.joy.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.joy.workoutapp.databinding.ActivityHomeBinding
import dev.joy.workoutapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)




       binding.btnSign.setOnClickListener{
            validity()

        }
        binding.tvLogin.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


        }


    fun validity(){
        val firstName= binding.etFirst.text.toString()
        val lastName=binding. etLast.text.toString()
        val email=binding. etEmail.text.toString()
        var Password=binding.etPass.text.toString()
        var ConfirmPassword=binding.etConfirm.text.toString()


        if (firstName.isBlank()) {
           binding. tilFirst.error="First Name required"
        }
        if (lastName.isBlank()) {
            binding.tilLast.error="Last Name required"
        }
        if (email.isBlank()) {
           binding. tilEmail.error="email required"
    }
        if (Password.isBlank()) {
          binding.tilPass.error="Pass required"

}
        if (ConfirmPassword.isBlank()) {
           binding. tilConfirm.error="confirm required"


            }
        if (Password !=ConfirmPassword){

        }
       else{binding.tilPass.error="password does not match"

       }
        if (Password.length<8){
            binding.tilPass.error="password is too short"
        }
        if (Password.length>12){
           binding. tilPass.error="password is too long"
        }


    }



    }









