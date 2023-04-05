package com.example.mobilne_zadanie_ivanovcharuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.visibility = View.VISIBLE

        var zalogowano = false
        var tablica = arrayOf("","","","")


        findViewById<Button>(R.id.btnwyjdz).setOnClickListener {
            navigationView.visibility = View.GONE
        }


        findViewById<ImageView>(R.id.icon).setOnClickListener {
            navigationView.visibility = View.VISIBLE
        }



        findViewById<Button>(R.id.strgl).setOnClickListener {
            Toast.makeText(this, "Strona główna jest już otwarta", Toast.LENGTH_SHORT).show()
        }


        findViewById<Button>(R.id.oceny).setOnClickListener {
            if(zalogowano==true)
                startActivity(Intent(this, Oceny::class.java).putExtra("Przerzucanie", tablica))
            else
                Toast.makeText(this, "Musisz się zalogować", Toast.LENGTH_SHORT).show()
        }


        findViewById<Button>(R.id.inf).setOnClickListener {
            if(zalogowano==true)
                startActivity(Intent(this,Informacja_Uzytkownik::class.java).putExtra("Przerzucanie", tablica))
            else
                Toast.makeText(this, "Musisz się zalogować", Toast.LENGTH_SHORT).show()

        }
        findViewById<Button>(R.id.wyslij).setOnClickListener{
            val imie = findViewById<EditText>(R.id.imie).text.toString()
            val nazwisko = findViewById<EditText>(R.id.nazwisko).text.toString()
            val klasa = findViewById<EditText>(R.id.klasa).text.toString()
            val nick = findViewById<EditText>(R.id.nick).text.toString()

            if (imie.isEmpty() || nazwisko.isEmpty() || klasa.isEmpty() || nick.isEmpty())
                Toast.makeText(this, "Wypełnij wszystkie pola", Toast.LENGTH_SHORT).show()
            else if (imie!="Ivan" || nazwisko!="Ovcharuk")
                Toast.makeText(this, "Niepoprawne dane", Toast.LENGTH_SHORT).show()
            else {
                zalogowano = true
                tablica[0] = imie
                tablica[1] = nazwisko
                tablica[2] = klasa
                tablica[3] = nick

                findViewById<EditText>(R.id.imie).visibility= View.GONE
                findViewById<EditText>(R.id.nazwisko).visibility= View.GONE
                findViewById<EditText>(R.id.klasa).visibility= View.GONE
                findViewById<EditText>(R.id.nick).visibility= View.GONE

                Toast.makeText(this, "Zalogowano!", Toast.LENGTH_SHORT).show()

            }
        }


    }
}