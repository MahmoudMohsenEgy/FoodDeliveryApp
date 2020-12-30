package com.example.advancedsoftwareproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedsoftwareproject.MenuItem
import com.example.advancedsoftwareproject.Order
import com.example.advancedsoftwareproject.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class OrderAdapter(
    order:ArrayList<MenuItem>,
    context: Context?
): RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {
    val orderData = order
    val thisContext = context
    class OrderViewHolder(v: View): RecyclerView.ViewHolder(v){

        val foodName : TextView = itemView.findViewById(R.id.order_FoodName)
        val foodPrice: TextView = itemView.findViewById(R.id.order_FoodPrice)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.order_item,parent,false)
        return OrderViewHolder(v)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        //Toast.makeText(thisContext,orderData.get(position).name,Toast.LENGTH_LONG).show()
        holder.foodName.text = orderData.get(position).name.toString()
        holder.foodPrice.text = orderData.get(position).price.toString()+"EGP"



    }


    override fun getItemCount(): Int {
        return orderData.size
    }



}