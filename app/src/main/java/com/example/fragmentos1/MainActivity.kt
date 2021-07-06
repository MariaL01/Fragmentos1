package com.example.fragmentos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentos1.fragmentos.PrimerFragment
import com.example.fragmentos1.fragmentos.SegundoFragment
import com.example.fragmentos1.fragmentos.TercerFragment

class MainActivity : AppCompatActivity() {
    lateinit var btnFragmento1:Button
    lateinit var btnFragmento2:Button
    lateinit var btnNavegador:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmento1 = findViewById(R.id.btnF1)
        btnFragmento2 = findViewById(R.id.btnF2)
        btnNavegador = findViewById(R.id.btnNavegador)

        btnFragmento1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedor,PrimerFragment.newInstance("hola","ii"))
                .commitNow()
        }

        btnFragmento2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedor,SegundoFragment.newInstance("hola","ii"))
                .commitNow()
        }

        btnNavegador.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.contenedor,TercerFragment.newInstance("https://google.com"))
                    .commitNow()
        }


    }
}