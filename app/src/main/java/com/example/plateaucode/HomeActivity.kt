package com.example.plateaucode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class HomeActivity : AppCompatActivity() {
    lateinit var state : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        state = findViewById(R.id.tv_select) as Spinner
        val states = arrayOf("Select State","Plateau", "Bauchi","Kaduna","Adamawa","Nasarawa")
        state.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,states)

    }
}
