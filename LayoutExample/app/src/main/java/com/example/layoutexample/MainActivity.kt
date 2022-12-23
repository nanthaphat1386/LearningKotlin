package com.example.layoutexample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.layoutexample.UI.BillCustomer


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val btnSearch = findViewById(R.id.search_btn) as Button
        val user = findViewById(R.id.username) as EditText
        btnSearch.setOnClickListener {
            val username = user.text
            if (username.contains("123456789") || username.contains("14141")){
                    Intent(this, BillCustomer::class.java).apply {
                        startActivity(this)
                    }
                user.text.clear()
                }else{
                    Toast.makeText(this@MainActivity, "ไม่พบรายการที่ค้นหา", Toast.LENGTH_SHORT).show()
            }
        }
    }
}