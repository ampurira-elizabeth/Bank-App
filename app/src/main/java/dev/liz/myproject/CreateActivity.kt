package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.liz.myproject.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {
  lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCreateBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_create)

        binding.swtPay.setOnClickListener {
            var intent=Intent(this,BillPayActivity::class.java)
            startActivity(intent)
        }
        binding.btnAcc.setOnClickListener {
           validate()
        }
    }
    fun validate(){
        var fast=binding.etFirstname.text.toString()
        var  second=binding.etSecond.text.toString()
        var phone=binding.etPhone.text.toString()
        var pass=binding.etPassword.text.toString()
        var error=false

        if (fast.isBlank()){
            binding.tilFirstname.error="First name required please"
            error=true
    }
        if (second.isBlank()){
            binding.tilSecond.error="Second name is required please"
            error=true
        }
        if (phone.isBlank()){
            binding.tilPhone.error="Phone number required please "
            error=true

        }
        if (pass.length>16){
            binding.tilPassword.error=" Your Password is too long"
            error=true
        }
        if (pass.length<8){
            binding.tilPassword.error="Your password is too short"
            error=true
        }
        if (!error){
            startActivity(Intent(this,BankActivity::class.java))
            finish()
        }


    }


}