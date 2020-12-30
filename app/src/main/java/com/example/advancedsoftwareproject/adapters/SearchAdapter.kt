package com.example.advancedsoftwareproject.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.foodData.Food
import kotlinx.android.synthetic.main.fragment_search.*

class SearchAdapter(
    food:ArrayList<Food>,
    context: Context?
): RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {
    val foodData = food
    val thisContext = context
    class SearchViewHolder(v: View):RecyclerView.ViewHolder(v){

        val name : TextView = itemView.findViewById(R.id.restaurantName)
        val address: TextView = itemView.findViewById(R.id.restaurant_address)
        val rating: TextView = itemView.findViewById(R.id.ratingNumber)
        val noOfReviews: TextView = itemView.findViewById(R.id.ratingsCount)
        val workingTime: TextView = itemView.findViewById(R.id.working_hours)
        val imageViewOfRestaurant: ImageView = itemView.findViewById(R.id.restaurantImage)
        val callButton: Button = itemView.findViewById(R.id.call_button)
        val menuButton: Button = itemView.findViewById(R.id.menu_button)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.restaurants_model,parent,false)
        return SearchViewHolder(v)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
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
                Toast.makeText(thisContext.applicationContext, "To the dial", Toast.LENGTH_LONG)
                    .show()
            }

        }
        holder.menuButton.setOnClickListener {



            //Toast.makeText(thisContext,"you clicked menu button", Toast.LENGTH_LONG).show()
            if (foodData.get(position).workingTime.toString().equals("9am-10pm")){
                Restaurants.menuPos=1
            }
            else{
                Restaurants.menuPos = 3
            }
            Navigation.findNavController(holder.menuButton).navigate(R.id.action_searchFragment_to_menuFragement)

        }


    }


    override fun getItemCount(): Int {
        return foodData.size
    }

    fun checkSearchBar(s:String){
        if(s.trim().length > 0)
        {
            for (pos in foodData)
                pos.name.contains(s)
        }
    }
    private fun startCall(position: Int) {
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        callIntent.setData(Uri.parse("tel:" + foodData.get(position).phoneNumber))
        thisContext?.applicationContext?.startActivity(callIntent)

    }

}