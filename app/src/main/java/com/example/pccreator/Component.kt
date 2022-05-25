package com.example.pccreator

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class Component : AppCompatActivity() {
    var preciototal: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component)

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val precio = bundle?.getString("precio")
        val imagen = bundle?.getString("Imagen")
        val posicion = bundle?.getInt("posicion")

        Toast.makeText(this, ""+precio, Toast.LENGTH_SHORT).show()

        val texttotalprice = findViewById<TextView>(R.id.textViewTotalPrice)
        val imgviewarrow = findViewById<ImageView>(R.id.iconarrowback)
        val imgviewsave = findViewById<ImageView>(R.id.iconsave)
        val imgviewcpu = findViewById<ImageView>(R.id.imageViewCPU)
        val imgviewmobo = findViewById<ImageView>(R.id.imageViewmobo)
        val imgviewgpu = findViewById<ImageView>(R.id.imageViewGpu)
        val imgviewstorage = findViewById<ImageView>(R.id.imageViewStorage)
        val imgviewpower = findViewById<ImageView>(R.id.imageViewPower)
        val imgviewram = findViewById<ImageView>(R.id.imageViewRam)
        val imgviewcase = findViewById<ImageView>(R.id.imageViewCase)
        val imgviewfan = findViewById<ImageView>(R.id.imageViewFan)

        if (precio != null) {
            preciototal += precio.toDouble()
            println("Nombre seleccionado: $nombre")
            println("Posicion seleccionado: $posicion")
            when (posicion){
                1 -> Picasso.with(this).load(imagen).into(imgviewcpu)
                2 -> Picasso.with(this).load(imagen).into(imgviewmobo)
                3 -> Picasso.with(this).load(imagen).into(imgviewgpu)
                4 -> Picasso.with(this).load(imagen).into(imgviewstorage)
                5 -> Picasso.with(this).load(imagen).into(imgviewpower)
                6 -> Picasso.with(this).load(imagen).into(imgviewram)
                7 -> Picasso.with(this).load(imagen).into(imgviewcase)
                8 -> Picasso.with(this).load(imagen).into(imgviewfan)
            }


        }


        texttotalprice.setText(""+preciototal)

        imgviewarrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imgviewsave.setOnClickListener {
            val intent = Intent(this, SaveBuild::class.java)
            startActivity(intent)
        }

        imgviewcpu.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 1)
            startActivity(intent2)

        }

        imgviewmobo.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 2)
            startActivity(intent2)

        }

        imgviewgpu.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 3)
            startActivity(intent2)
        }

        imgviewstorage.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 4)
            startActivity(intent2)
        }

        imgviewpower.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 5)
            startActivity(intent2)
        }

        imgviewram.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 6)
            startActivity(intent2)
        }

        imgviewcase.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 7)
            startActivity(intent2)
        }

        imgviewfan.setOnClickListener()
        {
            val intent2 = Intent(this, ListaComponentes::class.java)
            intent2.putExtra("opcion", 8)
            startActivity(intent2)
        }

    }
}