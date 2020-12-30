package com.example.advancedsoftwareproject.ui

import Restaurants
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advancedsoftwareproject.R
import com.example.advancedsoftwareproject.adapters.HomeRecyclerViewAdapter
import com.example.advancedsoftwareproject.adapters.MenuAdapter
import com.example.advancedsoftwareproject.adapters.SearchAdapter
import kotlinx.android.synthetic.main.fragment_menu_fragement.*
import kotlinx.android.synthetic.main.fragment_search.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragement.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragement : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    val restaurants = Restaurants()
    lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

       restaurants.setData()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_fragement, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if (restaurants.foodData.get(Restaurants.menuPos).workingTime.toString().equals("9am-10pm")){
            Restaurants.menuPos=0
        }


        menuAdapter = MenuAdapter(
            restaurants.foodData.get(Restaurants.menuPos).menu,
            activity?.applicationContext
        )
        menu_recyclerView.adapter = menuAdapter


    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MenuFragement.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                MenuFragement().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}