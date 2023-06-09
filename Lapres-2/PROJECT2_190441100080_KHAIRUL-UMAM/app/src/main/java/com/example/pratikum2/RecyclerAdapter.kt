package com.example.pratikum2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf("Chapter One", "Chapter Two", "Chapter tree", "Chapter four", "Chapter five", "Chapter six", "Chapter seven", "Chapter Eight" )

    private var details = arrayOf( "Item one details", "Item two details", "Item tree details", "Item four details", "Item five details",
        "Item six details", "Item seven details", "Item eight details")

    private val images = intArrayOf(R.drawable.stress, R.drawable.stress,
        R.drawable.stress, R.drawable.stress, R.drawable.stress, R.drawable.stress,
        R.drawable.stress, R.drawable.stress)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener{
                val position: Int = adapterPosition

                Toast.makeText(itemView.context,"you clicked on ${title[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }
}