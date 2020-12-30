package com.example.advancedsoftwareproject.ui.foodData

import com.example.advancedsoftwareproject.MenuItem

data class Food(

        var name: String,
        var address: String,
        var rating: Float,
        var noOfReviews: Int,
        var workingTime: String,
        var image:String ="",
        var phoneNumber:String,
        var menu: ArrayList<MenuItem> = arrayListOf()

        )