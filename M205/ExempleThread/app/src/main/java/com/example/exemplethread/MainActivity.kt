package com.example.exemplethread

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
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
         /*   progress!!.visibility=View.VISIBLE
            textview1!!.visibility =View.VISIBLE
            //Thread worker : demarrage
            val thread: Th1 = Th1()
            thread.start()
            btn?.setEnabled(false)*/

            //Creation de l'asyncTask
            val task = AsyncTask1()

            //Lancer le AsyncTask
            task.execute("Lancement de l'async Task", "param2","param3")

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


    internal inner class AsyncTask1 :
        AsyncTask<String?, Int?, String>()
    {
        //Contenir la tache de fond
        protected override fun doInBackground(vararg inputs: String?): String? {
            Log.i(
                Thread.currentThread().name,
                inputs[0]!!
            )
            for (i in 0..99) {
                try {
                    Thread.sleep(200)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                Log.i(
                    Thread.currentThread().name,
                    "Je suis endormi " + (i + 1)
                )
                //notifier l'avancement
                publishProgress(i)
            }

            return "Fin de la tache"
        }

        //Contenir l'initialisation
        override fun onPreExecute() {
            super.onPreExecute()
            progress!!.setVisibility(View.VISIBLE)
            textview1!!.setVisibility(View.VISIBLE)
            textview1!!.setText("0")
            btn!!.setEnabled(false)
        }

        //Contenir le code à executer si la tache est terminée
        override fun onPostExecute(result: String) {
            super.onPostExecute(result)
            progress!!.setVisibility(View.GONE)
            textview1!!.setVisibility(View.GONE)
            btn!!.setEnabled(true)
            Toast.makeText(this@MainActivity, "" + result, Toast.LENGTH_SHORT).show()
        }

        //Au cours de l'execution de la tache
        protected override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            progress!!.setProgress(values[0]!!)
            textview1!!.setText(java.lang.String.valueOf(progress!!.getProgress()))
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Un objet menuInflater
        //Inflater = de XML à Java
        menuInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        when(id)
        {
            R.id.id1 -> Toast.makeText(this, "Item call", Toast.LENGTH_LONG).show()
                R.id.id2 ->
                    Toast.makeText(this, "Item edit", Toast.LENGTH_LONG).show()
            R.id.id3 ->
                Toast.makeText(this, "Item settings", Toast.LENGTH_LONG).show()
            R.id.id4 ->
                Toast.makeText(this, "Item exit", Toast.LENGTH_LONG).show()
        }
        return true
    }
}

