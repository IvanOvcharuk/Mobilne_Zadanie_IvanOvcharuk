package com.example.mobilne_zadanie_ivanovcharuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class Informacja_Uzytkownik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacja_uzytkownik)

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
            startActivity(Intent(this,MainActivity::class.java))
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            startActivity(Intent(this, Oceny::class.java))
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            Toast.makeText(this, "Informacja jest już otwarta", Toast.LENGTH_SHORT).show()
        }
    }
}