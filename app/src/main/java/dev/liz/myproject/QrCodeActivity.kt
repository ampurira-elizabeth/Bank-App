package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class QrCodeActivity : AppCompatActivity() {
    lateinit var tvScan:TextView
    lateinit var imgBack:ImageView
    lateinit var imgNext:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_code)
        tvScan=findViewById(R.id.tvScan)
        imgNext=findViewById(R.id.imgNext)
        imgBack=findViewById(R.id.imgBack)
        imgBack.setOnClickListener {
            var intent=Intent(this,BillPayActivity::class.java)
            startActivity(intent)
        }
        imgNext.setOnClickListener {
            var intent=Intent(this,BankActivity::class.java)
            startActivity(intent)
        }




        tvScan.setOnClickListener {
            validate()

        }
    }
    fun validate(){
        var scan= tvScan.text.toString()
        if (scan.isNullOrBlank()){
            tvScan.error="Scan failed"}
        else if (scan.isNullOrEmpty()){
            tvScan.error="Scan failed"}
        else {
            tvScan.error = "Code Confirmed"
        }
    }

}