package com.example.progressbardemo2

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility

class MainActivity : AppCompatActivity() {

    lateinit var progressBar1 : ProgressBar
    lateinit var progressBar2 : ProgressBar
    lateinit var textView : TextView

    var n : Int =0

    var progressStatus : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        n = 0
        progressBar1= findViewById(R.id.progressBar1)
        progressBar2= findViewById(R.id.progressBar2)
        textView= findViewById(R.id.textView)
        //progressBar2.max = 100
        Thread( Runnable{
            while(progressStatus < 100)
            {
                progressStatus = doSomeWork()
            }
            //Le handler declaré dans la Thread Main el peut demander
            //au Thread main de modifier les composants (Views)
            /*handler.post {
                Runnable {

                }
            }*/
            runOnUiThread {
                //Cacher les progresses Bar
                progressBar1.visibility = View.GONE
                progressBar2.visibility = View.GONE
                textView.text = "Task completed"
            }


        }
        ).start() 
        
    }

    private fun doSomeWork(): Int {
        try {
            runOnUiThread {
                progressBar2.progress = n
                textView.text = n.toString()
            }
            Thread.sleep(100)
        }
        catch(ex : InterruptedException)
        {
            ex.printStackTrace()
        }
        return ++n
    }
}