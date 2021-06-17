package com.omercancali.misfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_teams.*

class Teams : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)

        var teamName : String
        var teamChampionships : String

        val redbullId = R.drawable.redbull
        val mercedesId = R.drawable.mercedes
        val mclarenId = R.drawable.mclaren
        val ferrariId = R.drawable.ferrari
        val astonId = R.drawable.aston
        val alphaId = R.drawable.alpha
        val alpineId = R.drawable.alpine
        val alfaId = R.drawable.alfa
        val williamsId = R.drawable.williams
        val haasId = R.drawable.haas

        var teamImageIDs = ArrayList<Int>()
        teamImageIDs.add(redbullId)
        teamImageIDs.add(mercedesId)
        teamImageIDs.add(mclarenId)
        teamImageIDs.add(ferrariId)
        teamImageIDs.add(astonId)
        teamImageIDs.add(alphaId)
        teamImageIDs.add(alpineId)
        teamImageIDs.add(alfaId)
        teamImageIDs.add(williamsId)
        teamImageIDs.add(haasId)

        val redbullImageView = findViewById<ImageView>(R.id.redbull)
        redbullImageView.setOnClickListener{

            teamName = "Red Bull Racing Honda"
            teamChampionships = "4 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[0])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val mercedesImageView = findViewById<ImageView>(R.id.mercedes)
        mercedesImageView.setOnClickListener{

            teamName = "Mercedes AMG Petronas F1"
            teamChampionships = "7 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[1])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val mclarenImageView = findViewById<ImageView>(R.id.mclaren)
        mclarenImageView.setOnClickListener{

            teamName = "Mclaren"
            teamChampionships = "8 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[2])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val ferrariImageView = findViewById<ImageView>(R.id.ferrari)
        ferrariImageView.setOnClickListener{

            teamName = "Scuderia Ferrari Mission Winnow"
            teamChampionships = "16 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[3])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val astonImageView = findViewById<ImageView>(R.id.aston)
        astonImageView.setOnClickListener{

            teamName = "Aston Martin Cognizant"
            teamChampionships = "0 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[4])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val alphaImageView = findViewById<ImageView>(R.id.alpha)
        alphaImageView.setOnClickListener{

            teamName = "Alpha Tauri Honda"
            teamChampionships = "0 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[5])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val alpineImageView = findViewById<ImageView>(R.id.alpine)
        alpineImageView.setOnClickListener{

            teamName = "Alpine Renault"
            teamChampionships = "12 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[6])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val alfaImageView = findViewById<ImageView>(R.id.alfa)
        alfaImageView.setOnClickListener{

            teamName = "Alfa Romeo Sauber"
            teamChampionships = "0 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[7])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val williamsImageView = findViewById<ImageView>(R.id.williams)
        williamsImageView.setOnClickListener{

            teamName = "Williams F1 Team"
            teamChampionships = "9 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[8])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

        val haasImageView = findViewById<ImageView>(R.id.haas)
        haasImageView.setOnClickListener{

            teamName = "Uralkali Haas F1 Team"
            teamChampionships = "0 Times"

            val intent = Intent(this@Teams,Details::class.java)
            intent.putExtra("ImageTeam",teamImageIDs[9])
            intent.putExtra("nameTeam", teamName)
            intent.putExtra("championTeam",teamChampionships)

            startActivity(intent)

        }

    }
}