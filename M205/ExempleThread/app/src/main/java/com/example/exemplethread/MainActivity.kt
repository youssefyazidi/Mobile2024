package com.example.exemplethread

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var textview1: TextView? = null
    private var progress: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn1)
        textview1 = findViewById(R.id.textView1)
        progress = findViewById(R.id.progress)

        //Cacher les composants- Avant de commancer le Thread
        //Initialisation de départ
        progress!!.visibility = View.GONE
        textview1!!.visibility =View.GONE

        btn?.setOnClickListener(View.OnClickListener {
            //Les composants visibles
            //Avant de commancer le Thread -precondition
            progress!!.visibility=View.VISIBLE
            textview1!!.visibility =View.VISIBLE
            //Thread worker : demarrage
            val thread: Th1 = Th1()
            thread.start()
            btn?.setEnabled(false)
        }) //fin setOnclickListener
    }

    internal inner class Th1 : Thread() {
        override fun run() {
            //Représente le travail de fond
            for (i in 0..99) {
                try {
                    sleep(200)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                Log.i(
                    currentThread().name,
                    "Je suis endormi " + (i + 1)
                )

                runOnUiThread {
                    progress!!.progress = i
                    textview1!!.text = progress!!.progress.toString()
               }
            }

            // Post condition = aprés l'execution de la tache de fond
            runOnUiThread {
                progress!!.visibility = View.GONE
                btn!!.isEnabled = true
                textview1!!.visibility = View.GONE
            }
        }
    }
}