package com.example.pccreator

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SaveBuild : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_build)

        val imgviewarrow = findViewById<ImageView>(R.id.iconarrowback)
        val textinput = findViewById<EditText>(R.id.editTextTextBuildName)

        imgviewarrow.setOnClickListener {
            // your code here
            val intent = Intent(this, Component::class.java)
            startActivity(intent)
        }


    }
    //Modificando el xml de la actividad
    fun hideKeyboard(view: android.view.View)
    {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}