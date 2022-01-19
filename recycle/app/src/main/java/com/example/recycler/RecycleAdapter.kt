package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(private val items: List<Triple<Int, String, String>>):
    RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var name: TextView? = null
        var info: TextView? = null
        var pic: ImageView? = null
        init {
            name = itemView.findViewById(R.id.name)
            info = itemView.findViewById(R.id.info)
            pic = itemView.findViewById(R.id.picture)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder.name?.text = items[pos].second
        holder.info?.text = items[pos].third
        holder.pic?.setImageResource(items[pos].first)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val items = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recycle_list, parent, false)
        return ViewHolder(items)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}