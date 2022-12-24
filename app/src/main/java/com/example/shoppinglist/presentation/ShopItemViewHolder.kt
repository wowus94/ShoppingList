package com.example.shoppinglist.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.R

class ShopItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val textViewName: TextView = view.findViewById(R.id.tv_name)
    val textViewCount: TextView = view.findViewById(R.id.tv_count)
}