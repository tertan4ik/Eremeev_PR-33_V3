package com.example.eremeev_pr_33_v3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class Ecran2Activity : AppCompatActivity() {

    private lateinit var spinner:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ecran2)
        spinner=findViewById(R.id.spinner)
        val listitem= listOf<String>("1.1-Од комнатная квартира","2.2-Х комнатная квартира","3.3-Х комнатная квартира","4.4-Х комнатная квартира","5.Студия")
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,listitem)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=arrayAdapter
    }
}