package com.example.activite3

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    //Une autre façon de gérer les événements
    fun showDonatOrder(view: View) {

            displayToast(view.contentDescription.toString())
    }


     fun displayToast(message : String)
     {
         Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
     }

    fun orderDonat(view: View) {

        //displayToast("Click sur le FAB")

        //Le type Intent : Permet de réaliser une communication inter Composants
        val intent :Intent
        //Création d'un Objet Intent
        intent= Intent(this, OrderActivity::class.java)

        //Démarrer la nouvelle activity
        startActivity(intent)

    }
}