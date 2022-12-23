package com.example.layoutexample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutexample.R
import com.example.layoutexample.data.DataDetail


class DataInfoAdaptor(private val context: Context?) : RecyclerView.Adapter<DataInfoAdaptor.DataInfoViewHolder>() {
    private val dts = DataDetail.Datas
    class DataInfoViewHolder (view: View?): RecyclerView.ViewHolder(view!!) {
        val dataName:TextView? = view!!.findViewById(R.id.dataName)
        val dataCost:TextView? = view!!.findViewById(R.id.dataCost)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataInfoViewHolder {
        return DataInfoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_bill_customer,parent,false))
    }

    override fun onBindViewHolder(holder: DataInfoViewHolder, position: Int) {
        val dtsData = dts[position]
        // Set the text for the current dog's name
        holder.dataName?.text = dtsData.name
        // Set the text for the current dog's age
        val resources = context?.resources
        holder.dataCost?.text = resources?.getString(R.string.data_cost, dtsData.cost)
    }

    override fun getItemCount(): Int {
        return dts.size
    }
}