package com.example.a1_recyclerviewcustombasicadapterkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.String

class CustomAdapter(val context: Context, val studentArrayList: ArrayList<Student>): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.tvOrder.text = (position + 1).toString()
        holder.tvFullName.text = studentArrayList[position].fullName
        holder.tvAge.text = String.valueOf(studentArrayList[position].age)
    }

    override fun getItemCount(): Int {
        return studentArrayList.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvOrder = view.findViewById<TextView>(R.id.order_no_item)
        val tvFullName = view.findViewById<TextView>(R.id.tv_fullname_item)
        val tvAge = view.findViewById<TextView>(R.id.tv_age_item)
    }
}
