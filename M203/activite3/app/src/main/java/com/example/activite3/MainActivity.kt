package com.example.activite3

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declarer des references vers les composants
    lateinit var editTextTaille:EditText
    lateinit var editTextPoids:EditText

    lateinit var radioMetre:RadioButton
    lateinit var radioCentimetre:RadioButton

    lateinit var checkMega:CheckBox
    lateinit var buttonCalculer:Button
    lateinit var buttonAnnuler:Button

    lateinit var textResultat:TextView

    //C'est une fonction de cycle de vie = appeler au moment de la creation de la l'activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //associer l'activity au layout
        //Classe R qui se crée automatiquement
        //R= contient toutes les ressource de l'app
        //sous forme de constnante entiers
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Lier les comosants graphiques aux references
        editTextTaille =findViewById(R.id.txtTaille)
        editTextTaille.requestFocus()
        editTextPoids=findViewById(R.id.txtPoids)

        radioMetre=findViewById(R.id.radioMetre)
        radioCentimetre=findViewById(R.id.radioCentimetre)

        checkMega=findViewById(R.id.checkMega)

        buttonCalculer =findViewById(R.id.btnCalculer)
        buttonAnnuler =findViewById(R.id.btnAnnuler)

        textResultat = findViewById(R.id.textViewResultat)

        //Exploiter les references

        //Gerer l'evenement click sur le button annuler

        buttonAnnuler.setOnClickListener {

            editTextTaille.text.clear()
            editTextPoids.text.clear()

            radioMetre.isChecked = true
            textResultat.text = "Resultat :"

        }
        buttonCalculer.setOnClickListener {

            if (editTextPoids.text.isEmpty() || editTextPoids.text.isEmpty() )
            {
                Toast.makeText(applicationContext,
                    "Veuillez entrer le données !!",
                    Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else {
                val poids = editTextPoids.text.toString().toDouble()
                var taille = editTextTaille.text.toString().toDouble()

                if (taille == 0.0)
                {
                    Toast.makeText(applicationContext,
                        "Veuillez entrer une taille positive !!",
                        Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                if (radioCentimetre.isChecked)
                {
                    taille = taille/100
                }
                val imc = poids/(taille*taille)
                textResultat.text = "Resultat :  %.3f ".format(imc)
            }
        }
    }


}