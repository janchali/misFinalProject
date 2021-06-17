package com.omercancali.misfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_drivers.*

class Drivers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drivers)

        var driverName : String
        var driverTeam : String
        var driverNumber : String
        var worldChampion : String

        val verstappenId = R.drawable.verstappen
        val perezId = R.drawable.perez
        val hamiltonId = R.drawable.hamilton
        val bottasId = R.drawable.bottas
        val leclercId = R.drawable.leclerc
        val sainzId = R.drawable.sainz
        val ricciardoId = R.drawable.ricciardo
        val norrisId = R.drawable.norris
        val vettelId = R.drawable.vettel
        val strollId = R.drawable.stroll
        val gaslyId = R.drawable.gasly
        val tsunodaId = R.drawable.tsunoda
        val oconId = R.drawable.ocon
        val alonsoId = R.drawable.alonso
        val raikonnenId = R.drawable.raikonnen
        val giovinazziId = R.drawable.giovinazzi
        val russelId = R.drawable.russel
        val latifiId = R.drawable.latifi
        val schumacherId = R.drawable.schumacher
        val mazepinId = R.drawable.mazepin

        var driverImageIDs = ArrayList<Int>()
        driverImageIDs.add(verstappenId)
        driverImageIDs.add(perezId)
        driverImageIDs.add(hamiltonId)
        driverImageIDs.add(bottasId)
        driverImageIDs.add(leclercId)
        driverImageIDs.add(sainzId)
        driverImageIDs.add(ricciardoId)
        driverImageIDs.add(norrisId)
        driverImageIDs.add(vettelId)
        driverImageIDs.add(strollId)
        driverImageIDs.add(gaslyId)
        driverImageIDs.add(tsunodaId)
        driverImageIDs.add(oconId)
        driverImageIDs.add(alonsoId)
        driverImageIDs.add(raikonnenId)
        driverImageIDs.add(giovinazziId)
        driverImageIDs.add(russelId)
        driverImageIDs.add(latifiId)
        driverImageIDs.add(schumacherId)
        driverImageIDs.add(mazepinId)

        val verstappenImageView = findViewById<ImageView>(R.id.verstappen)
        verstappenImageView.setOnClickListener{

            driverName = "Max Verstappen"
            driverTeam = "Red Bull Racing Honda"
            driverNumber = "33"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[0])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val perezImageView = findViewById<ImageView>(R.id.perez)
        perezImageView.setOnClickListener{

            driverName = "Sergio Perez"
            driverTeam = "Red Bull Racing Honda"
            driverNumber = "11"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[1])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val hamiltonImageView = findViewById<ImageView>(R.id.hamilton)
        hamiltonImageView.setOnClickListener{

            driverName = "Sir Lewis Hamilton"
            driverTeam = "Mercedes AMG Petronas F1"
            driverNumber = "44"
            worldChampion = "7 Times"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[2])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val bottasImageView = findViewById<ImageView>(R.id.bottas)
        bottasImageView.setOnClickListener{

            driverName = "Valtteri Bottas"
            driverTeam = "Mercedes AMG Petronas F1"
            driverNumber = "77"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[3])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val leclercImageView = findViewById<ImageView>(R.id.leclerc)
        leclercImageView.setOnClickListener{

            driverName = "Charles Leclerc"
            driverTeam = "Scuderia Ferrari Mission Winnow"
            driverNumber = "16"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[4])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val sainzImageView = findViewById<ImageView>(R.id.sainz)
        sainzImageView.setOnClickListener{

            driverName = "Carlos Sainz Jr."
            driverTeam = "Scuderia Ferrari Mission Winnow"
            driverNumber = "55"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[5])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val ricciardoImageView = findViewById<ImageView>(R.id.ricciardo)
        ricciardoImageView.setOnClickListener{

            driverName = "Daniel Ricciardo"
            driverTeam = "Mclaren"
            driverNumber = "3"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[6])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val norrisImageView = findViewById<ImageView>(R.id.norris)
        norrisImageView.setOnClickListener{

            driverName = "Lando Norris"
            driverTeam = "Mclaren"
            driverNumber = "4"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[7])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val vettelImageView = findViewById<ImageView>(R.id.vettel)
        vettelImageView.setOnClickListener{

            driverName = "Sebastian Vettel"
            driverTeam = "Aston Martin Cognizant"
            driverNumber = "5"
            worldChampion = "4 Times"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[8])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val strollImageView = findViewById<ImageView>(R.id.stroll)
        strollImageView.setOnClickListener{

            driverName = "Lance Stroll"
            driverTeam = "Aston Martin Cognizant"
            driverNumber = "18"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[9])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val gaslyImageView = findViewById<ImageView>(R.id.gasly)
        gaslyImageView.setOnClickListener{

            driverName = "Pierre Gasly"
            driverTeam = "Alpha Tauri Honda"
            driverNumber = "10"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[10])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val tsunodaImageView = findViewById<ImageView>(R.id.tsunoda)
        tsunodaImageView.setOnClickListener{

            driverName = "Yuki Tsunoda"
            driverTeam = "Alpha Tauri Honda"
            driverNumber = "22"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[11])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val oconImageView = findViewById<ImageView>(R.id.ocon)
        oconImageView.setOnClickListener{

            driverName = "Esteban Ocon"
            driverTeam = "Alpine Renault"
            driverNumber = "31"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[12])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val alonsoImageView = findViewById<ImageView>(R.id.alonso)
        alonsoImageView.setOnClickListener{

            driverName = "Fernando Alonso"
            driverTeam = "Alpine Renault"
            driverNumber = "14"
            worldChampion = "2 Times"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[13])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val raikonnenImageView = findViewById<ImageView>(R.id.raikonnen)
        raikonnenImageView.setOnClickListener{

            driverName = "Kimi Raikonnen"
            driverTeam = "Alfa Romeo Sauber"
            driverNumber = "7"
            worldChampion = "1 Time"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[14])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val giovinazziImageView = findViewById<ImageView>(R.id.giovinazzi)
        giovinazziImageView.setOnClickListener{

            driverName = "Antonio Giovinazzi"
            driverTeam = "Alfa Romeo Sauber"
            driverNumber = "99"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[15])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val russelImageView = findViewById<ImageView>(R.id.russel)
        russelImageView.setOnClickListener{

            driverName = "George Russel"
            driverTeam = "Williams Mercedes"
            driverNumber = "63"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[16])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val latifiImageView = findViewById<ImageView>(R.id.latifi)
        latifiImageView.setOnClickListener{

            driverName = "Nicolas Latifi"
            driverTeam = "Williams Mercedes"
            driverNumber = "6"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[17])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val schumacherImageView = findViewById<ImageView>(R.id.schumacher)
        schumacherImageView.setOnClickListener{

            driverName = "Mick Schumacher"
            driverTeam = "Uralkali Haas"
            driverNumber = "43"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[18])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }

        val mazepinImageView = findViewById<ImageView>(R.id.mazepin)
        mazepinImageView.setOnClickListener{

            driverName = "Nikita Mazepin"
            driverTeam = "Uralkali Haas"
            driverNumber = "9"
            worldChampion = "0"

            val intent = Intent(this@Drivers,Details::class.java)
            intent.putExtra("Image",driverImageIDs[19])
            intent.putExtra("name", driverName)
            intent.putExtra("team",driverTeam)
            intent.putExtra("number",driverNumber)
            intent.putExtra("champion",worldChampion)

            startActivity(intent)

        }


    }
}