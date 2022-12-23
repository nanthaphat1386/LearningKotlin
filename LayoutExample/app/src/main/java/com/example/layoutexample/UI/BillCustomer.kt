package com.example.layoutexample.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutexample.Adapter.DataInfoAdaptor
import com.example.layoutexample.MainActivity
import com.example.layoutexample.R
import com.example.layoutexample.databinding.ActivityBillCustomerBinding

class BillCustomer : AppCompatActivity() {
    private lateinit var binding: ActivityBillCustomerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBillCustomerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_bill_customer)
        binding.recycleView.adapter = DataInfoAdaptor(
            applicationContext
        )
        binding.recycleView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val btnCancel = findViewById<Button>(R.id.cancelALL)
        btnCancel.setOnClickListener {
            Intent(this, BillCustomer::class.java).apply {
                startActivity(this)
            }
        }
    }
}
