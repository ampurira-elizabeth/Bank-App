package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var btnLog2:Button
    lateinit var etEmail:EditText
    lateinit var etPass:EditText
    lateinit var tvSignup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLog2=findViewById(R.id.btnLog2)
        tvSignup=findViewById(R.id.tvSignup)
        etEmail=findViewById(R.id.etEmail)
        etPass=findViewById(R.id.etPass)
        btnLog2.setOnClickListener {
            validate()
        }
        tvSignup.setOnClickListener {
            var intent=Intent(this,CreateActivity::class.java)
            startActivity(intent)
        }

    }
    fun validate(){
        var email=etEmail.text.toString()
        var pass=etPass.text.toString()
        var error=false
        if (email.isBlank()){
            etEmail.error="Email required please"
            error=true
        }
        if (pass.isBlank()){
            etPass.error="password required please"
            error=true

        }
        if (!error){
            startActivity(Intent(this,BankActivity::class.java))
            finish()
        }
    }
}