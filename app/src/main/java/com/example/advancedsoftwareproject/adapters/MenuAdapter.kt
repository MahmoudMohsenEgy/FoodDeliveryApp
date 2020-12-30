package com.example.advancedsoftwareproject.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.advancedsoftwareproject.MenuItem
import com.example.advancedsoftwareproject.Order
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.foodData.Food
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MenuAdapter(
    menu:ArrayList<MenuItem>,
    context: Context?
): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    val menuData = menu
    val thisContext = context
    class MenuViewHolder(v: View): RecyclerView.ViewHolder(v){

        val foodName : TextView = itemView.findViewById(R.id.FoodName)
        val foodPrice: TextView = itemView.findViewById(R.id.FoodPrice)
        val numberOfLikes: TextView = itemView.findViewById(R.id.numberOfLikes)
        val addToOrderButton:FloatingActionButton = itemView.findViewById(R.id.addFoodButton)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.menu_item,parent,false)
        return MenuViewHolder(v)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.foodName.text = menuData.get(position).name.toString()
        holder.foodPrice.text = menuData.get(position).price.toString()+"EGP"
        holder.numberOfLikes.text = menuData.get(position).numberOfLikes.toString()
        holder.addToOrderButton.setOnClickListener {
            Toast.makeText(holder.addToOrderButton.context,holder.foodName.text.toString() + " is added to cart ", Toast.LENGTH_SHORT).show()
           Order.orderTotalPrice += menuData.get(position).price.toString().toInt()
            Order.actualOrder.add(menuData.get(position))
        }


    }


    override fun getItemCount(): Int {
        return menuData.size
    }



}