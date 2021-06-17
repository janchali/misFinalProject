package com.omercancali.misfinalproject

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_store.*


class Store : AppCompatActivity() {

    lateinit var driversSpinner : Spinner
    lateinit var teamsSpinner : Spinner
    lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        sharedPreferences = getSharedPreferences("Favourite Team", Context.MODE_PRIVATE)
        sharedPreferences = getSharedPreferences("Favourite Driver", Context.MODE_PRIVATE)
        favTeamText.text = "Favourite Constructor: ${sharedPreferences.getString("storedTeam","You have not selected a constructor.")}"
        favDriverText.text = "Favourite Driver: ${sharedPreferences.getString("storedDriver","You have not selected a driver.")}"

        driversSpinner = findViewById<Spinner>(R.id.driversSpinner)

        var driversArray =
            arrayOf("Max Verstappen",
            "Sergio Perez",
            "Lewis Hamilton",
            "Valterri Bottas",
            "Charles Leclerc",
            "Carlos Sainz Jr.",
            "Dainel Ricciardo",
            "Lando Norris",
            "Sebastian Vettel",
            "Lance Stroll",
            "Pierre Gasly",
            "Yuki Tsunoda",
            "Esteban Ocon",
            "Fernando Alonso",
            "Kimi Raikönnen",
            "Antoino Giovinazzi",
            "George Russell",
            "Nikolas Latifi",
            "Mick Schumacher",
            "Nikita Mazepin")

        driversSpinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,driversArray)

        driversSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                sharedPreferences.edit().putString("storedDriver","${driversArray.get(position)}").apply()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        teamsSpinner = findViewById<Spinner>(R.id.teamsSpinner)

        var teamsArray =
            arrayOf("Red Bull Racing Honda",
                "Mercedes-AMG Petronas F1",
                "McLaren F1",
                "Scuderia Ferrari",
                "Aston Martin Cognizant",
                "Alpha Tauri Honda",
                "Alpine Renault",
                "Alfa Romeo Sauber",
                "Williams F1",
                "Haas F1")

        teamsSpinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,teamsArray)

        teamsSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                sharedPreferences.edit().putString("storedTeam","${teamsArray.get(position)}").apply()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }

    fun saveButton(view : View) {
        favTeamText.text = "Favourite Constructor: ${sharedPreferences.getString("storedTeam","You have not selected a constructor.")}"
        favDriverText.text = "Favourite Driver: ${sharedPreferences.getString("storedDriver","You have not selected a driver.")}"
        Toast.makeText(this@Store,"Your favourites has been saved",Toast.LENGTH_LONG).show()
        //Kullanıcıların butona basınca kaydolduğunu anlamaları için bulabildiğim tek yol bu oldu.
    }

}

