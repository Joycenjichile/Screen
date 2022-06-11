package dev.joy.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var btnSign:Button
    lateinit var tvLogin:TextView
    lateinit var etLogin:TextInputEditText
    lateinit var tilFirst: TextInputLayout
    lateinit var etFirst: TextInputEditText
    lateinit var tilLast: TextInputLayout
    lateinit var etLast: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPass: TextInputLayout
    lateinit var etPass: TextInputEditText
    lateinit var tilConfirm: TextInputLayout
    lateinit var etConfirm: TextInputEditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        tvLogin=findViewById(R.id.tvLogin)
        etLast=findViewById(R.id.etLast)
        tilLast=findViewById(R.id.tilLast)
        etEmail=findViewById(R.id.etEmail)
        tilEmail=findViewById(R.id.tilEmail)
        etFirst=findViewById(R.id.etFirst)
        tilFirst=findViewById(R.id.tilFirst)
        tilConfirm=findViewById(R.id.tilConfirm)
        etConfirm=findViewById(R.id.etConfirm)
        tilPass=findViewById(R.id.tilPass)
        etPass=findViewById(R.id.etPass)
        btnSign=findViewById(R.id.btnSign)

        btnSign.setOnClickListener{
            validity()

        }
        tvLogin.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


        }


    fun validity(){
        val firstName= etFirst.text.toString()
        val lastName= etLast.text.toString()
        val email= etEmail.text.toString()
        var Password=etPass.text.toString()
        var ConfirmPassword=etConfirm.text.toString()


        if (firstName.isBlank()) {
            tilFirst.error="First Name required"
        }
        if (lastName.isBlank()) {
            tilLast.error="Last Name required"
        }
        if (email.isBlank()) {
            tilEmail.error="email required"
    }
        if (Password.isBlank()) {
            tilPass.error="Pass required"

}
        if (ConfirmPassword.isBlank()) {
            tilConfirm.error="confirm required"


            }
        if (Password !=ConfirmPassword){

        }
       else{tilPass.error="password does not match"

       }
        if (Password.length<8){
            tilPass.error="password is too short"
        }
        if (Password.length>12){
            tilPass.error="password is too long"
        }


    }



    }









