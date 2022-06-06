package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BillPayActivity : AppCompatActivity() {
    lateinit var btnNxt:Button
    lateinit var btnBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill_pay)

        btnBack=findViewById(R.id.btnBack)
        btnNxt=findViewById(R.id.btnNxt)

        btnBack.setOnClickListener {
            var intent=Intent(this,CreateActivity::class.java)
            startActivity(intent)
        }
        btnNxt.setOnClickListener {
            var intent=Intent(this,QrCodeActivity::class.java)
            startActivity(intent)
        }
    }
}