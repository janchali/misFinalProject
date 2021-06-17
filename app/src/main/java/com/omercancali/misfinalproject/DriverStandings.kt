package com.omercancali.misfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_driver_standings.*
import kotlinx.android.synthetic.main.activity_drivers.*

class DriverStandings : AppCompatActivity() {

    var pointsAndDrivers: ArrayList<Driver> = ArrayList()
    var adapter: DriverRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_standings)


        pointsAndDrivers = arrayListOf(
            Driver("Max Verstappen", 105),
            Driver("Lewis Hamilton", 101),
            Driver("Sergio Perez", 69),
            Driver("Lando Norris", 66),
            Driver("Charles Leclerc", 52),
            Driver("Valtteri Bottas", 47),
            Driver("Carlos Sainz", 42),
            Driver("Pierre Gasly", 31),
            Driver("Sebastian Vettel", 28),
            Driver("Daniel Ricciardo", 26),
            Driver("Fernando Alonso", 13),
            Driver("Esteban Ocon", 12),
            Driver("Lance Stroll", 9),
            Driver("Yuki Tsunoda", 8),
            Driver("Kimi Raikönnen", 1),
            Driver("Antonio Giovinazzi", 1),
            Driver("Mick Schumacher", 0),
            Driver("Nikita Mazepin", 0),
            Driver("George Russell", 0),
            Driver("Nikolas Latifi", 0))

        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = DriverRecyclerAdapter(pointsAndDrivers)
        recyclerView.adapter = adapter


        /*
        val res = pointsAndDrivers.sortedByDescending { driverStatsForPoints -> driverStatsForPoints.points }
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,res)
        listView.adapter=adapter*/

    }
}

