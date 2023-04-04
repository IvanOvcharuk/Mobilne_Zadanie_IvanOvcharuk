package com.example.mobilne_zadanie_ivanovcharuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        findViewById<Button>(R.id.btnwyjdz).setOnClickListener {
            val navigationView = findViewById<NavigationView>(R.id.nav_view)
            navigationView.visibility = View.GONE
        }


        findViewById<ImageView>(R.id.icon).setOnClickListener {
            val navigationView = findViewById<NavigationView>(R.id.nav_view)
            navigationView.visibility = View.VISIBLE
        }



        findViewById<Button>(R.id.strgl).setOnClickListener {
            Toast.makeText(this, "Strona główna jest już otwarta", Toast.LENGTH_SHORT).show()
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            startActivity(Intent(this, Oceny::class.java))
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            startActivity(Intent(this,Informacja_Uzytkownik::class.java))
        }
    }
}