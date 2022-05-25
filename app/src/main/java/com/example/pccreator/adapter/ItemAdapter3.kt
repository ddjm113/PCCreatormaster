package com.example.pccreator.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pccreator.R
import com.example.pccreator.model.Item

class ItemAdapter3 (
    private val context: Context,
    private val Names: List<Item>,

    ): RecyclerView.Adapter<ItemAdapter3.ItemViewHolder>() {

        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
            val name: TextView = view.findViewById(R.id.software_title)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item3, parent, false)

            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val name = Names[position]

            holder.name.text = context.resources.getString(name.stringResourceId)
        }

        override fun getItemCount(): Int {
            return Names.size;
        }

}