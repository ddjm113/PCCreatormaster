package com.example.pccreator

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.squareup.picasso.Picasso
import okhttp3.*
import java.io.IOException



class ListaComponentes : AppCompatActivity() {

    private lateinit var item1_nom: TextView
    private lateinit var item1_pre: TextView
    private lateinit var item1_img: ImageView
    private lateinit var item2_nom: TextView
    private lateinit var item2_pre: TextView
    private lateinit var item2_img: ImageView
    private lateinit var item3_nom: TextView
    private lateinit var item3_pre: TextView
    private lateinit var item3_img: ImageView
    private lateinit var item4_nom: TextView
    private lateinit var item4_pre: TextView
    private lateinit var item4_img: ImageView

    private var txtNombre: String = ""
    private var txtPrecio: Float = 0.0f
    private var imgProducto: String = ""
    private var nom1: String = ""
    private var precio: Float = 0.0f
    private var txtNombre2: String = ""
    private var txtPrecio2: Float = 0.0f
    private var imgProducto2: String = ""
    private var nom2: String = ""
    private var precio2: Float = 0.0f

    private var url1 = ""
    private var url2 = ""
    private var url3 = ""
    private var url4 = ""


    private var img1: String = ""
    private var img2: String = ""
    private var img3: String = ""
    private var img4: String = ""





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_componentes)

        item1_nom = findViewById(R.id.item1_name)
        item1_pre = findViewById(R.id.item1_price)
        item1_img = findViewById(R.id.item1_image)

        item2_nom = findViewById(R.id.item2_name)
        item2_pre = findViewById(R.id.item2_price)
        item2_img = findViewById(R.id.item2_image)

        item3_nom = findViewById(R.id.item3_name)
        item3_pre = findViewById(R.id.item3_price)
        item3_img = findViewById(R.id.item3_image)

        item4_nom = findViewById(R.id.item4_name)
        item4_pre = findViewById(R.id.item4_price)
        item4_img = findViewById(R.id.item4_image)




        val imgviewarrow = findViewById<ImageView>(R.id.iconarrow)


        var item1 = findViewById<RelativeLayout>(R.id.contenedor1)
        var item2 = findViewById<RelativeLayout>(R.id.contenedor2)
        var item3 = findViewById<RelativeLayout>(R.id.contenedor3)
        var item4 = findViewById<RelativeLayout>(R.id.contenedor4)

        val bundle = intent.extras
        val dato = bundle?.getInt("opcion")
        Toast.makeText(this, ""+dato, Toast.LENGTH_SHORT).show()

        if (dato != null) {
            getitem(dato)

        }

        imgviewarrow.setOnClickListener {
            // your code here
            val intent = Intent(this, Component::class.java)
            startActivity(intent)

        }

        var nomsel: String = ""
        var presel: String = ""
        var imgsel: String = ""
        var posicion = bundle?.getInt("opcion")

        item1.setOnClickListener{

            val intent = Intent(this, Component::class.java)
            nomsel = item1_nom.text.toString()
            println("nombre del producto: $nomsel")
            presel = item1_pre.text.toString()
            println("Precio del producto: $presel")
            imgsel = img1
            intent.putExtra("nombre", nomsel)
            intent.putExtra("precio", presel)
            intent.putExtra("Imagen", imgsel)
            intent.putExtra("posicion", posicion)

            startActivity(intent)


        }
        item2.setOnClickListener {

            val intent = Intent(this, Component::class.java)
            nomsel = item2_nom.text.toString()
            println("nombre del producto: $nomsel")
            presel = item2_pre.text.toString()
            println("Precio del producto: $presel")
            imgsel = img2
            intent.putExtra("nombre", nomsel)
            intent.putExtra("precio", presel)
            intent.putExtra("Imagen", imgsel)
            intent.putExtra("posicion", posicion)

            startActivity(intent)
        }
        item3.setOnClickListener {

            val intent = Intent(this, Component::class.java)
            nomsel = item3_nom.text.toString()
            println("nombre del producto: $nomsel")
            presel = item3_pre.text.toString()
            println("Precio del producto: $presel")
            imgsel = img3
            intent.putExtra("nombre", nomsel)
            intent.putExtra("precio", presel)
            intent.putExtra("Imagen", imgsel)
            intent.putExtra("posicion", posicion)

            startActivity(intent)
        }
        item4.setOnClickListener {

            val intent = Intent(this, Component::class.java)
            nomsel = item4_nom.text.toString()
            println("nombre del producto: $nomsel")
            presel = item4_pre.text.toString()
            println("Precio del producto: $presel")
            imgsel = img4
            intent.putExtra("nombre", nomsel)
            intent.putExtra("precio", presel)
            intent.putExtra("Imagen", imgsel)
            intent.putExtra("posicion", posicion)

            startActivity(intent)
        }
    }




    fun fetchjson(url:String){
        println("attempting to fetch json")



        val request = Request.Builder().url(url).get()
            .addHeader("X-RapidAPI-Host", "axesso-axesso-amazon-data-service-v1.p.rapidapi.com")
            .addHeader("X-RapidAPI-Key", "6b96b5a946msha774ff63a7150e6p199311jsn85147a8b4538").build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                println("request failed")
                nom1 = "Failed"
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)

                val gson = GsonBuilder().create()

                val homefeed = gson.fromJson(body, HomeFeed::class.java )

                txtNombre = homefeed.productTitle
                txtPrecio = homefeed.price
                imgProducto = homefeed.imageUrlList[1]

                nom1 = txtNombre
                precio = txtPrecio

            }

        })
    }

    fun fetchjson2(url:String){
        println("attempting to fetch json")



        val request = Request.Builder().url(url).get()
            .addHeader("X-RapidAPI-Host", "axesso-axesso-amazon-data-service-v1.p.rapidapi.com")
            .addHeader("X-RapidAPI-Key", "6b96b5a946msha774ff63a7150e6p199311jsn85147a8b4538").build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                println("request failed")
                nom2 = "Failed"
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)

                val gson = GsonBuilder().create()

                val homefeed = gson.fromJson(body, HomeFeed::class.java )

                txtNombre2 = homefeed.productTitle
                txtPrecio2 = homefeed.price
                imgProducto2 = homefeed.imageUrlList[1]

                nom2 = txtNombre2
                precio2 = txtPrecio2

            }

        })
    }

    class HomeFeed(val productTitle: String, val price: Float, val features: List<String>, val imageUrlList: List<String>)

    class Feature(val ft: String )

    private fun cargar(url1: String, url2: String, url3: String, url4: String){

        fetchjson(url1)
        while (nom1.isEmpty())
        {
        }
        item1_nom.text = nom1.toString()
        item1_pre.text = "$precio"
        img1 = imgProducto
        Picasso.with(this).load(imgProducto).into(item1_img)

        nom2 = ""
        fetchjson2(url2)
        while (nom2.isEmpty()) {
        }
        item2_nom.text = nom2.toString()
        item2_pre.text = "$precio2"
        img2 = imgProducto2
        Picasso.with(this).load(imgProducto2).into(item2_img)



        Handler().postDelayed({
            nom1 = ""
            fetchjson(url3)
            while (nom1.isEmpty())
            {
            }
            item3_nom.text = nom1.toString()
            item3_pre.text = "$precio"
            img3 = imgProducto
            Picasso.with(this).load(imgProducto).into(item3_img)

            nom2 = ""
            fetchjson2(url4)
            while (nom2.isEmpty())
            {
            }
            item4_nom.text = nom2.toString()
            item4_pre.text = "$precio2"
            img4 = imgProducto2
            Picasso.with(this).load(imgProducto2).into(item4_img)
        }, 1000)


    }

    private fun getitem(dato: Int)
    {

        if(dato == 1)
        {

            url1 = "https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08164VTWH"
            url2 = "https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB09FXDLX95"
            url3 = "https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB07S6CRLVD"
            url4 = "https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB09FXKHN7M"
            cargar(url1, url2, url3, url4)
        }
        if(dato == 2)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB07T5QDRFX"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB099TKZX5Q"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB088W7RKVZ"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB089CWDHFZ"
            cargar(url1, url2, url3, url4)
        }

        if(dato == 3)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08Y934HZQ"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB0985VND1G"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB086VR4VHX"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB09L42H2B5"
            cargar(url1, url2, url3, url4)
        }
        if(dato == 4)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08PMLYV9H"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB0088PUEPK"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08V83JZH4"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08GLX7TNT"
            cargar(url1, url2, url3, url4)
        }
        if(dato == 5)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08JGPBML2"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08R5PH1VY"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB01LYRXRDI"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08HMMZFXZ"
            cargar(url1, url2, url3, url4)
        }
        if (dato == 6)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08176KLZT"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB019FRCV9G"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB082DGZJ9C"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08PJNVWNZ"
            cargar(url1, url2, url3, url4)
        }
        if (dato == 7)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08P5WPFH7"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08PT7V83P"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB099K4H2KB"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB08C788312"
            cargar(url1, url2, url3, url4)
        }
        if(dato == 8)
        {
            url1="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB00JQ2YDCY"
            url2="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB0953JH8WR"
            url3="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB07H1VZ11F"
            url4="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product?url=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB07QQXCVVR"
            cargar(url1, url2, url3, url4)
        }
    }
}