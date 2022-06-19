package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dev.liz.myproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
   lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLog2.setOnClickListener {
            validate()
        }
        binding.tvSignup.setOnClickListener {
            var intent=Intent(this,CreateActivity::class.java)
            startActivity(intent)
        }

    }
    fun validate(){
        var email=binding.etEmail.text.toString()
        var pass=binding.etPass.text.toString()
        var error=false
        if (email.isBlank()){
            binding.etEmail.error="Email required please"
            error=true
        }
        if (pass.isBlank()){
            binding.etPass.error="password required please"
            error=true

        }
        if (!error){
            startActivity(Intent(this,BankActivity::class.java))
            finish()
        }
    }
}