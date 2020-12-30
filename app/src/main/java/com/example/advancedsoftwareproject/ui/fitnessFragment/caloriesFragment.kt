package com.example.advancedsoftwareproject.ui.fitnessFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advancedsoftwareproject.R
import kotlinx.android.synthetic.main.fragment_calories.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [caloriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class caloriesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submitCalories.setOnClickListener {
            var weight_float = weight.text.toString().toFloat()
            var height_float = height.text.toString().toFloat()
            var year = years.text.toString().toInt()
             var gender = switchGender.isChecked

            var bmrCount = calculateBMR(weight_float,height_float,year,gender)
            groupQuestions.visibility = View.INVISIBLE
            caloriesNumberText.text = "You have today "+ bmrCount.toString() +" Calories!"
            caloriesNumberText.visibility = View.VISIBLE
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment caloriesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            caloriesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    fun calculateBMR(
         weight:Float = 0f,
         height: Float = 0f,
         age:Int = 0,
         gender:Boolean


    ):Float{
        var bmr:Float = 0f
        if(gender){
           bmr = (10*weight+6.25*height-5*age - 161).toFloat()
        }
        else{
            bmr = (10*weight+6.25*height-5*age + 5).toFloat()
        }

        return bmr
    }
}