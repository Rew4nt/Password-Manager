package com.example.appprototype

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val items: ArrayList<user>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val website: TextView = view.findViewById(R.id.website)
        val username: TextView = view.findViewById(R.id.username)
        val password: TextView = view.findViewById(R.id.pass)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.website.text = item.website
        holder.username.text = item.username
        holder.password.text = item.pass
    }

    override fun getItemCount():Int {

        return items.size
    }
}