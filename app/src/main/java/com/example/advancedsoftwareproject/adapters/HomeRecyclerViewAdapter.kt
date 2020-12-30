package com.example.advancedsoftwareproject.adapters

import Restaurants
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.foodData.Food
import com.example.advancedsoftwareproject.ui.homeActivity.MainActivity
import com.example.advancedsoftwareproject.ui.homeFragment.HomeFragment
import com.squareup.picasso.Picasso
import kotlinx.coroutines.withContext
import java.time.Duration
import java.util.jar.Manifest
import kotlin.coroutines.coroutineContext

class HomeRecyclerViewAdapter(
        food:ArrayList<Food>,
        context:Context?,
) : RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {
    var foodData = food
    val thisContext = context




    class HomeViewHolder(v: View):RecyclerView.ViewHolder(v){
         val name : TextView = itemView.findViewById(R.id.restaurantName)
        val address: TextView = itemView.findViewById(R.id.restaurant_address)
         val rating: TextView = itemView.findViewById(R.id.ratingNumber)
         val noOfReviews: TextView = itemView.findViewById(R.id.ratingsCount)
         val workingTime: TextView = itemView.findViewById(R.id.working_hours)
        val imageViewOfRestaurant: ImageView = itemView.findViewById(R.id.restaurantImage)
        val callButton: Button = itemView.findViewById(R.id.call_button)
        val menuButton:Button = itemView.findViewById(R.id.menu_button)



    }
    class HeaderViewHolder(v:View):RecyclerView.ViewHolder(v){
        val header:TextView = itemView.findViewById(R.id.home_food_header)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.restaurants_model,parent,false)
        return HomeViewHolder(View)

    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.name.setText(foodData.get(position).name)
        holder.address.setText(foodData.get(position).address)
        holder.rating.setText(foodData.get(position).rating.toString())
        holder.noOfReviews.setText(foodData.get(position).noOfReviews.toString())
        holder.workingTime.setText(foodData.get(position).workingTime)
        Glide
                .with(holder.imageViewOfRestaurant.context)
                .load(foodData.get(position).image)
                .centerCrop()
                .into(holder.imageViewOfRestaurant)
        holder.callButton.setOnClickListener {
            startCall(position)
            if (thisContext != null) {
                Toast.makeText(thisContext.applicationContext,"To the dial",Toast.LENGTH_LONG).show()
            }


        }
        holder.menuButton.setOnClickListener {



            //Toast.makeText(thisContext,"you clicked menu button", Toast.LENGTH_LONG).show()
            Restaurants.menuPos = position
            Navigation.findNavController(holder.menuButton).navigate(R.id.action_homeFragment_to_menuFragement)

        }
    }



    override fun getItemCount(): Int {
        return foodData.size
    }


private fun startCall(position: Int) {
    val callIntent = Intent(Intent.ACTION_DIAL)
    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

    callIntent.setData(Uri.parse("tel:" + foodData.get(position).phoneNumber))
    thisContext?.applicationContext?.startActivity(callIntent)

}
}