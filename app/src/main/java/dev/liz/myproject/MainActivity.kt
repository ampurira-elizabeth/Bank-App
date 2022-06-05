package dev.liz.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var btnLog:Button
    lateinit var btnCreate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog=findViewById(R.id.btnLog)
        btnLog.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        btnCreate=findViewById(R.id.btnCreate)
        btnCreate.setOnClickListener {
            var intent=Intent(this,CreateActivity::class.java)
            startActivity(intent)
        }
    }

}