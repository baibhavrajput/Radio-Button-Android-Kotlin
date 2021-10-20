package com.example.radiobutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioButton1 -> {
                    Toast.makeText(this, "Item is now Radio Button1" , Toast.LENGTH_LONG).show()
                }R.id.radioButton2 -> {
                    Toast.makeText(this, "Item is now Radio Button2" , Toast.LENGTH_LONG).show()
                }R.id.radioButton3 -> {
                    Toast.makeText(this, "Item is now Radio Button3" , Toast.LENGTH_LONG).show()
                }
            }
        }

    }



}