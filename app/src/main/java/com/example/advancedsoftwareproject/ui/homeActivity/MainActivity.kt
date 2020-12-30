package com.example.advancedsoftwareproject.ui.homeActivity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.ui.foodData.Food
import com.example.advancedsoftwareproject.ui.homeFragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_waiting_for_food.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)

        val navController = Navigation
            .findNavController(this, R.id.fragmentFrame)


        NavigationUI.setupWithNavController(myNavigationBar, navController)
    }

}