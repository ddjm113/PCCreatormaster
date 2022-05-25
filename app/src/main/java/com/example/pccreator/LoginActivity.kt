package com.example.pccreator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.sql.PreparedStatement
import java.sql.SQLException
import java.sql.Statement

class LoginActivity : AppCompatActivity() {
	
	private var connectSql = ConnectSQL()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_login)
		
		setup()
	}
	
	private fun setup(){

		//Cuando 'Iniciar sesión' sea presionado, verificar si existe un elemento con mismo correo y contraseña
		findViewById<Button>(R.id.login_login_button).setOnClickListener {
			auth()
		}
		
		
		//Cuando '¿No tienes cuenta? ¡Únete!' sea presionado, mandar a la actividad para registrar una cuenta
		findViewById<TextView>(R.id.login_register).setOnClickListener {
			val sendToRegister = Intent(this, RegisterActivity::class.java)
			startActivity(sendToRegister)
		}
	}
	
	fun auth(){
		//Se guardan los valores de email y contraseña
		val email = findViewById<EditText>(R.id.login_email).text.toString()
		val password = findViewById<EditText>(R.id.login_password).text.toString()
		
		try{
			val sql = "SELECT * FROM UserData WHERE UserDataId = '$email' AND Password = '$password'" //Las reglas que tendrá la solicitud a la base de datos
			val rs = connectSql.connect()?.createStatement()?.executeQuery(sql) //Se ejecta una solicitud a la base de datos
			
			rs?.next() //De los datos obtenidos se pasa al a siguiente columna
			
			//Se guardan los datos obtenidos de la base de datos (email y contrasñea)
			val dbEmail = rs?.getString("UserDataId")
			val dbPassword = rs?.getString("Password")
			
			//Si los datos ingresados coinciden con los datos traidos de la base de datos...
			if( email == dbEmail || password == dbPassword ){
				val sendToMain = Intent(this, MainActivity::class.java)
				finishAffinity() //Cerrar todas las actividades
				startActivity(sendToMain) //Pasar a la actividad main (vistas de las builds)
			}
			
		}catch (ex: SQLException){ //Si en dado caso no se logró encontrar coincidencias en la base de datos...
			Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show() //Mostrar mensaje
			Log.e("Error", "$ex") //Imprimir error en consola
		}
	}
}
