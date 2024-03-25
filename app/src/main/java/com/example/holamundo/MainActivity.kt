package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    //Despues de la clase van las variables globales
    lateinit var nombre: EditText
    lateinit var ok: Button
    lateinit var mostrar: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombre=findViewById(R.id.nombre)
        ok = findViewById(R.id.Ok)
        mostrar = findViewById(R.id.ense)

        /*
                //construye variables
                var nombre: EditText = findViewById(R.id.nombre)
                var Ok: Button = findViewById(R.id.Ok)
                var mostrar: TextView = findViewById(R.id.ense)
                var construye: String= ""


                Ok.setOnClickListener{
                    //Revisar que la caja de texto no esté vacía
                    if(!nombre.text.toString().isEmpty()){
                        //Este IF valida que el texto no este vacio

                        construye = "Hola "+nombre.text.toString()+" ¿Como estas?"
                         mostrar.text= construye.toString()
                    }
                    else{

                        var alerta=AlertDialog.Builder(this)
                            .setTitle("¡¡¡ERROR!!!")
                            .setMessage("No ha ingresado un nombre")
                        alerta.show()

                    }

                }
        */

    }//TERMINA METODO ONCREATE

    fun construyeSaludo(v:View){

        if (!nombre.text.toString().isEmpty()){

            var construye="Hola "+nombre.text.toString()+" ¿Como estas? :)"
            mostrar.text=construye
        }//fin de if

        else{
            var alerta = AlertDialog.Builder(this)
                .setTitle("¡¡¡ERROR!!!")
                .setMessage("No ha ingresado un nombre")
            alerta.show()
        }//Termina else



    }//Termina la funcion construyeSaludo



}