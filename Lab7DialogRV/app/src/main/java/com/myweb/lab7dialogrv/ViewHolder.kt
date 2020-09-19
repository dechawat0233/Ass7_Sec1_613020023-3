package com.myweb.lab7dialogrv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_item_layout.view.*


class ViewHolder (view: View):RecyclerView.ViewHolder(view){
    val tvName = view.tv_name
    val tvGen = view.tv_gen
    val tvEmail = view.tv_email
    val tvSal = view.tv_sal
}