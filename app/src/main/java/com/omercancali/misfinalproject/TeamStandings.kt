package com.omercancali.misfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_driver_standings.*
import kotlinx.android.synthetic.main.activity_team_standings.*

class TeamStandings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_standings)

        val pointsAndTeams = listOf(Team("Red Bull Racing Honda", 174),
            Team("Mercedes", 148),
            Team("Ferrari", 94),
            Team("Mclaren", 92),
            Team("AlphaTauri Honda",39),
            Team("Aston Martin",37),
            Team("Alpine Renault",25),
            Team("Alfa Romeo Sauber",2),
            Team("Haas",0),
            Team("Williams",0))

        val res = pointsAndTeams.sortedByDescending { teamStatsForPoints -> teamStatsForPoints.points }

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,res)
        listViewTeams.adapter=adapter

    }


}