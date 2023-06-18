package com.example.grosary_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


class appleActivity : AppCompatActivity() {

    lateinit var edtnoofapple:EditText
    lateinit var edtbyperapple:EditText
    lateinit var edtsellperapple:EditText
    lateinit var edtnoitemsold:EditText
    lateinit var btntotalbutton:Button
    lateinit var Tv_total:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)

        edtnoofapple = findViewById(R.id.editno_of_apple)
        edtbyperapple = findViewById(R.id.edtbp_per_apple)
        edtsellperapple = findViewById(R.id.edtsp_per_apple)
        edtnoitemsold = findViewById(R.id.edtsp_per_apple)
        btntotalbutton = findViewById(R.id.btntotal)
        Tv_total = findViewById(R.id.tvapple_total)


        val number_of_apple = edtnoofapple.text.toString()
        val buying_per_apple = edtbyperapple.text.toString()
        val selling_per_apple = edtsellperapple.text.toString()
        val number_item_sold = edtnoitemsold.text.toString()

        btntotalbutton.setOnClickListener {
            if(number_item_sold.isEmpty() && selling_per_apple.isEmpty() && buying_per_apple.isEmpty() && number_item_sold.isEmpty() && number_of_apple.isNotBlank()){
                Toast.makeText(this, "please complete entering the values", Toast.LENGTH_SHORT).show()
            }else{
                var total = number_of_apple.toDouble()*buying_per_apple.toDouble()+selling_per_apple.toDouble()*number_item_sold.toDouble()
                Tv_total.text = total.toString()

            }
        }
//


    }
}