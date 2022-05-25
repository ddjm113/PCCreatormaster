package com.example.pccreator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.sql.PreparedStatement
import java.sql.SQLException
import java.time.Instant

class RegisterActivity : AppCompatActivity() {
	
	private var connectSql = ConnectSQL()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_register)
		
		setup()
	}
	
	private fun setup(){
		//Declare button
		val loginButton = findViewById<Button>(R.id.login_login_button)
		
		//When 'login' button is pressed...
		loginButton.setOnClickListener {
			createUser()
		}
	}
	
	private fun createUser(){
		try{
			val email = findViewById<EditText>(R.id.login_email).text.toString()
			val password = findViewById<EditText>(R.id.login_password).text.toString()
			
			
			//Se crea una declaración precompilada de SQL, en donde se ejecutará el método para conectarse a la base de datos y posteriormente registrar en la tabla un usario.
			val user: PreparedStatement = connectSql.connect()?.prepareStatement("INSERT INTO UserData VALUES (?, ?)")!!
			
			
			user.setString(1, email ) //Se cambia el primer ? por el email
			user.setString(2, password ) //Se cambia el segundo ? por la contraseña
			user.executeUpdate() //Se actualiza y ejecuta
			
			
			Toast.makeText(this, "Cuenta creada con éxito.", Toast.LENGTH_SHORT).show()
			
			val sendToMain = Intent(this, MainActivity::class.java)
			finishAffinity()
			startActivity(sendToMain)
			
		}catch (ex: SQLException){
			Toast.makeText(this,"No se pudo registrar el usuario.", Toast.LENGTH_SHORT).show()
		}
	}
}
