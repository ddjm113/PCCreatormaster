package com.example.pccreator.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.pccreator.Component
import com.example.pccreator.R
import com.example.pccreator.model.Image
import com.example.pccreator.model.Item

class itemAdapter2 (
    private val context: Context,
    private val Names: List<Item>,
    private val Prices: List<Item>,
    private val Images: List<Image>,
): RecyclerView.Adapter<itemAdapter2.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.item_name)
        val price: TextView = view.findViewById(R.id.item_price)
        val img: ImageView = view.findViewById(R.id.item_image)
        val card: CardView = view.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item2, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name = Names[position]
        val price = Prices[position]
        val image = Images[position]

        holder.name.text = context.resources.getString(name.stringResourceId)
        holder.price.text = context.resources.getString(price.stringResourceId)
        holder.img.setImageResource(image.imageResourceId)
        holder.card.setOnClickListener {
                Toast.makeText(holder.itemView.context, context.resources.getString(price.stringResourceId), Toast.LENGTH_SHORT).show()
                val intent = Intent(holder.itemView.context, Component::class.java)
                intent.putExtra("precio", context.resources.getString(price.stringResourceId))
                intent.putExtra("imagen", ""+holder.img.setImageResource(image.imageResourceId))
                holder.itemView.context.startActivity(intent)
                }
    }

    override fun getItemCount(): Int {
        return Names.size;
    }
}