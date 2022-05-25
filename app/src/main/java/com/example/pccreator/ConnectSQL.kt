package com.example.pccreator

import android.os.StrictMode
import android.util.Log
import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class ConnectSQL {
	//Datos de nuestra conección a la base de datos
	val ip = "192.168.100.150"
	val port = "60177"
	val database = "pccreator2"
	val username = "test"
	val password = "test"
	
	//Función para conectarse
	fun connect(): Connection?{
		//Se establece el modo estricto en donde se desabilita la deteccion de todo
		val policy = StrictMode.ThreadPolicy.Builder()
			.permitAll()
			.build()
		StrictMode.setThreadPolicy(policy)
		
		//Se crea una variable de tipo Connection inicialmente nula
		var conn : Connection? = null
		
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance()
			
			//Se intenta establecer la conexión a la base de datos
			conn = DriverManager.getConnection(
				"jdbc:jtds:sqlserver://$ip:$port;databasename=$database;user=$username;password=$password;"
			)
		}catch (ex: SQLException){ //En caso contrario imprimir en consola los errores
			Log.e("Error", ex.message!!)
		}catch (ex1: ClassNotFoundException){
			Log.e("Error", ex1.message!!)
		}catch (ex2: Exception){
			Log.e("Error", ex2.message!!)
		}
		
		return conn
	}
}
