package com.jd.jd158.dinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodList = arrayListOf("Pizza", "Nazigoren", "Baksddu", "Macarrao", "ovo")
        var nullable : String? = "Nullable test"

        var l = if (nullable != null) nullable.length else -1


        decideBtn.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count());
            foodNametxt.text = foodList[randomFood] 

        }

        addFoodBtn.setOnClickListener(){
            foodList.add(addFoodText.text.toString())
            addFoodText.text.clear()
        }
    }
}
