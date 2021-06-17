package com.omercancali.misfinalproject

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent
        val driverImageId = intent.getIntExtra("Image",0)
        val driverName = intent.getStringExtra("name")
        val driverTeam = intent.getStringExtra("team")
        val driverNumber = intent.getStringExtra("number")
        val worldChampion = intent.getStringExtra("champion")
        val teamImageId = intent.getIntExtra("ImageTeam",0)
        val teamName = intent.getStringExtra("nameTeam")
        val teamChampionships = intent.getStringExtra("championTeam")
        val trackImageId = intent.getIntExtra("ImageTrack",0)
        val trackName = intent.getStringExtra("trackName")
        val trackCountry = intent.getStringExtra("trackCountry")
        val trackDate = intent.getStringExtra("trackDate")
        val raceWinner = intent.getStringExtra("trackWinner")

        if (driverName != null) {
            val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,driverImageId)
            imageView.setImageBitmap(selectedBitmap)
            nameText.text = "Name: ${driverName}"
            teamText.text = "Team: ${driverTeam}"
            numberText.text = "Driver Number: ${driverNumber}"
            wdcText.text = "World Champion: ${worldChampion}"
        } else if (teamName != null) {
            val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,teamImageId)
            imageView.setImageBitmap(selectedBitmap)
            nameText.text = "Constructor Name: ${teamName}"
            teamText.text = "Constructor Championship: ${teamChampionships}"
            numberText.visibility = View.INVISIBLE
            wdcText.visibility = View.INVISIBLE
        } else {
            val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,trackImageId)
            imageView.setImageBitmap(selectedBitmap)
            nameText.text = "Name: ${trackName}"
            teamText.text = "Country: ${trackCountry}"
            numberText.text = "Race Date: ${trackDate}"
            wdcText.text = "Race Winner: ${raceWinner}"
        }
    }
}