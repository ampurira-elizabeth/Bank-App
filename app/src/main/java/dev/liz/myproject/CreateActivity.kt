package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
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
    lateinit var swtPay:Switch

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
        swtPay=findViewById(R.id.swtPay)
        swtPay.setOnClickListener {
            var intent=Intent(this,BillPayActivity::class.java)
            startActivity(intent)
        }




        btnAcc.setOnClickListener {
           validate()
        }
    }
    fun validate(){
        var fast=etFirstname.text.toString()
        var  second=etSecond.text.toString()
        var phone=etPhone.text.toString()
        var pass=etPassword.text.toString()
        var error=false

        if (fast.isBlank()){
            tilFirstname.error="First name required please"
            error=true
    }
        if (second.isBlank()){
            tilSecond.error="Second name is required please"
            error=true
        }
        if (phone.isBlank()){
            tilPhone.error="Phone number required please "
            error=true

        }
        if (pass.length>16){
            tilPassword.error=" Your Password is too long"
            error=true
        }
        if (pass.length<8){
            tilPassword.error="Your password is too short"
            error=true
        }
        if (!error){
            startActivity(Intent(this,BankActivity::class.java))
            finish()
        }


    }


}