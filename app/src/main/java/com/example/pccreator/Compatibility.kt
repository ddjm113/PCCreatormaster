package com.example.pccreator

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pccreator.adapter.ItemAdapter3
import com.example.pccreator.data.DataSourceAlta
import com.example.pccreator.data.DataSourceBaja
import com.example.pccreator.data.DataSourceMedia

class Compatibility : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compatibility)

        val imgviewarrow = findViewById<ImageView>(R.id.iconarrowback)

        val bundle = intent.extras
        val dato = bundle?.getInt("opcion")
        Toast.makeText(this, ""+dato, Toast.LENGTH_SHORT).show()

        if (dato != null) {
            getitem(dato)
        }

        imgviewarrow.setOnClickListener {
            // your code here
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun getitem(dato: Int) {
        if(dato==0)
        {
            findViewById<ImageView>(R.id.imageViewComp1).setImageResource(R.drawable.case6)
            findViewById<ImageView>(R.id.imageViewComp2).setImageResource(R.drawable.i5)
            findViewById<ImageView>(R.id.imageViewComp3).setImageResource(R.drawable.rtx3060ti)
            findViewById<TextView>(R.id.textViewCompPrice).setText("30000")
            findViewById<TextView>(R.id.textViewBuildName).setText("PC GAMA ALTA")
            val names = DataSourceAlta().loadNames()
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewComp)
            recyclerView.adapter = ItemAdapter3(this, names)
            recyclerView.setHasFixedSize(true)

        }
        if(dato==1)
        {
            findViewById<ImageView>(R.id.imageViewComp1).setImageResource(R.drawable.case4)
            findViewById<ImageView>(R.id.imageViewComp2).setImageResource(R.drawable.r3390x)
            findViewById<ImageView>(R.id.imageViewComp3).setImageResource(R.drawable.gtx1660ti)
            findViewById<TextView>(R.id.textViewCompPrice).setText("20000")
            findViewById<TextView>(R.id.textViewBuildName).setText("PC GAMA MEDIA")
            val names = DataSourceMedia().loadNames()
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewComp)
            recyclerView.adapter = ItemAdapter3(this, names)
            recyclerView.setHasFixedSize(true)
        }
        if(dato==2)
        {
            findViewById<ImageView>(R.id.imageViewComp1).setImageResource(R.drawable.case1)
            findViewById<ImageView>(R.id.imageViewComp2).setImageResource(R.drawable.ixeon)
            findViewById<ImageView>(R.id.imageViewComp3).setImageResource(R.drawable.gtx1050ti)
            findViewById<TextView>(R.id.textViewCompPrice).setText("10000")
            findViewById<TextView>(R.id.textViewBuildName).setText("PC GAMA BAJA")
            val names = DataSourceBaja().loadNames()
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewComp)
            recyclerView.adapter = ItemAdapter3(this, names)
            recyclerView.setHasFixedSize(true)
        }
    }

}