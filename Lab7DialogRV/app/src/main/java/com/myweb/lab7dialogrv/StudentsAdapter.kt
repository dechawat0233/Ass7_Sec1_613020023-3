package com.myweb.lab7dialogrv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentsAdapter (val item : List<Student>,val context: Context):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent, false)
    return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = "Name"+item[position].name
        holder.tvGen.text = "Gender:"+item[position].gen
        holder.tvEmail.text = "Email"+item[position].email
        holder.tvSal.text = "Salary"+item[position].sal.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}