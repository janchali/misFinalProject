package com.omercancali.misfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.omercancali.misfinalproject.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        nextRace.text = " Next Race: France - Circuit Paul Ricard - 20 March 2021"
    }

    fun driverStandingsButton(view: View) {
        val intent = Intent(applicationContext,DriverStandings::class.java)
        startActivity(intent)
    }

    fun teamStandingsButton(view:View) {
        val intent = Intent(applicationContext,TeamStandings::class.java)
        startActivity(intent)
    }

    fun raceCalendarButton(view:View) {
        val intent = Intent(applicationContext,RaceCalendar::class.java)
        startActivity(intent)
    }

    fun driversButton(view:View) {
        val intent = Intent(applicationContext,Drivers::class.java)
        startActivity(intent)
    }

    fun teamsButton(view:View) {
        val intent = Intent(applicationContext,Teams::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.save,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.save_item) {
            val intent = Intent(applicationContext,Store::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}