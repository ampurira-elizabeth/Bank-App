package dev.liz.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CreateActivity : AppCompatActivity() {
    lateinit var btnAcc:Button
    lateinit var tilFirstname:TextInputLayout
    lateinit var tilSecond:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var tilPhone:TextInputLayout
    lateinit var etFirstname:TextInputEditText
    lateinit var etSecond:TextInputEditText
    lateinit var etPhone:TextInputEditText
    lateinit var etPassword:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        btnAcc=findViewById(R.id.btnAcc)
        tilFirstname=findViewById(R.id.tilFirstname)
        tilSecond=findViewById(R.id.tilSecond)
        tilPassword=findViewById(R.id.tilPassword)
        tilPhone=findViewById(R.id.tilPhone)
        etFirstname=findViewById(R.id.etFirstname)
        etSecond=findViewById(R.id.etSecond)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)

        btnAcc.setOnClickListener {
           validate()
        }
    }
    fun validate(){
        var fast=etFirstname.text.toString()
        var  second=etSecond.text.toString()
        var phone=etPhone.text.toString()
        var pass=etPassword.text.toString()
        if (fast.isBlank()){
            tilFirstname.error="First name required please"
    }
        if (second.isBlank()){
            tilSecond.error="Second name is required please"
        }
        if (phone.isBlank()){
            tilPhone.error="Phone number required please "
        }
        if (pass.isBlank()){
            tilPassword.error="Password required please"

        }

    }


}