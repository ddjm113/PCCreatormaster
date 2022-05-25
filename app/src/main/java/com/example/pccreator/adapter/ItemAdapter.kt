package com.example.pccreator.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.pccreator.Compatibility
import com.example.pccreator.R
import com.example.pccreator.model.Build

class ItemAdapter(
    private val context: Context,
    val dataset: MutableList<Build>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{
    private var listData: MutableList<Build> = dataset as MutableList<Build>

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view)
    {
        val textViewBuild: TextView=view.findViewById(R.id.item_title)
        val imageview: ImageView = view.findViewById(R.id.item_image)
        val textViewValue: TextView=view.findViewById(R.id.build_price)
        val cardView: CardView=view.findViewById(R.id.card_view)
        val buttonView: Button =view.findViewById(R.id.buttondelet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = listData[position]
        holder.textViewBuild.text = context.resources.getString(item.stringResourceId)
        holder.imageview.setImageResource(item.imageResourceId)
        holder.textViewValue.text = context.resources.getString(item.valueResourceId)

        holder.cardView.setOnClickListener {(
                Toast.makeText(holder.itemView.context, position.toString(), Toast.LENGTH_SHORT).show())
                val intent = Intent(holder.itemView.context, Compatibility::class.java)
                intent.putExtra("opcion", position)
                holder.itemView.context.startActivity(intent)
                }
        holder.buttonView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Se presiono boton borrar", Toast.LENGTH_SHORT).show()
            /**listData.removeAt(position)
            notifyDataSetChanged()**/
        }
    }

    override fun getItemCount(): Int {

        return listData.size
    }

}