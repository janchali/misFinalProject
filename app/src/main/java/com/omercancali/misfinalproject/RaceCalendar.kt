package com.omercancali.misfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_race_calendar.*

class RaceCalendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_race_calendar)

        var trackName : String
        var trackCountry : String
        var trackDate : String
        var raceWinner : String

        val bahrainId = R.drawable.bahrain
        val imolaId = R.drawable.imola
        val portimaoId = R.drawable.portimao
        val monacoId = R.drawable.monaco
        val azerbaijanId = R.drawable.azerbaijan
        val franceId = R.drawable.france
        val austriaId = R.drawable.austria
        val ukId = R.drawable.uk
        val hungaryId = R.drawable.hungary
        val belgiumId = R.drawable.belgium
        val netherlandsId = R.drawable.netherlands
        val monzaId = R.drawable.monza
        val russiaId = R.drawable.russia
        val japanId = R.drawable.japan
        val usaId = R.drawable.usa
        val mexicoId = R.drawable.mexico
        val brazilId = R.drawable.brazil
        val australiaId = R.drawable.australia
        val saudiId = R.drawable.saudi
        val uaeId = R.drawable.uae

        var trackImageIDs = ArrayList<Int>()
        trackImageIDs.add(bahrainId)
        trackImageIDs.add(imolaId)
        trackImageIDs.add(portimaoId)
        trackImageIDs.add(monacoId)
        trackImageIDs.add(azerbaijanId)
        trackImageIDs.add(franceId)
        trackImageIDs.add(austriaId)
        trackImageIDs.add(ukId)
        trackImageIDs.add(hungaryId)
        trackImageIDs.add(belgiumId)
        trackImageIDs.add(netherlandsId)
        trackImageIDs.add(monzaId)
        trackImageIDs.add(russiaId)
        trackImageIDs.add(japanId)
        trackImageIDs.add(usaId)
        trackImageIDs.add(mexicoId)
        trackImageIDs.add(brazilId)
        trackImageIDs.add(australiaId)
        trackImageIDs.add(saudiId)
        trackImageIDs.add(uaeId)


        val bahrainImageView = findViewById<ImageView>(R.id.bahrain)
        bahrainImageView.setOnClickListener{

            trackName = "Bahrain International"
            trackCountry = "Bahrain"
            trackDate = "28 March 2021"
            raceWinner = "Lewis Hamilton"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[0])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val imolaImageView = findViewById<ImageView>(R.id.imola)
        imolaImageView.setOnClickListener{

            trackName = "Imola e Dino Ferrari"
            trackCountry = "Italy"
            trackDate = "18 April 2021"
            raceWinner = "Max Verstappen"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[1])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val portimaoImageView = findViewById<ImageView>(R.id.portimao)
        portimaoImageView.setOnClickListener{

            trackName = "Circuit Algarve"
            trackCountry = "Portugal"
            trackDate = "02 May 2021"
            raceWinner = "Lewis Hamilton"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[2])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val monacoImageView = findViewById<ImageView>(R.id.monaco)
        monacoImageView.setOnClickListener{

            trackName = "Circuit Monte Carlo"
            trackCountry = "Monaco"
            trackDate = "23 May 2021"
            raceWinner = "Max Verstappen"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[3])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val azerbaijanImageView = findViewById<ImageView>(R.id.azerbaijan)
        azerbaijanImageView.setOnClickListener{

            trackName = "Baku Street Circuit"
            trackCountry = "Azerbaijan"
            trackDate = "6 June 2021"
            raceWinner = "Sergio Perez"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[4])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val franceImageView = findViewById<ImageView>(R.id.france)
        franceImageView.setOnClickListener{

            trackName = "Circuit Paul Ricard"
            trackCountry = "France"
            trackDate = "20 June 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[5])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val austriaImageView = findViewById<ImageView>(R.id.austria)
        austriaImageView.setOnClickListener{

            trackName = "Red Bull Ring"
            trackCountry = "Austria"
            trackDate = "27 June 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[6])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val austria2ImageView = findViewById<ImageView>(R.id.austria2)
        austria2ImageView.setOnClickListener{

            trackName = "Red Bull Ring"
            trackCountry = "Austria"
            trackDate = "4 July 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[6])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val ukImageView = findViewById<ImageView>(R.id.uk)
        ukImageView.setOnClickListener{

            trackName = "Silverstone International"
            trackCountry = "United Kingdom"
            trackDate = "18 July 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[7])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val hungaryImageView = findViewById<ImageView>(R.id.hungary)
        hungaryImageView.setOnClickListener{

            trackName = "Hungaroring"
            trackCountry = "Hungary"
            trackDate = "1 August 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[8])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val belgiumImageView = findViewById<ImageView>(R.id.belgium)
        belgiumImageView.setOnClickListener{

            trackName = "Circuit Spa Francorchamps"
            trackCountry = "Belgium"
            trackDate = "29 August 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[9])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val netherlandsImageView = findViewById<ImageView>(R.id.netherlands)
        netherlandsImageView.setOnClickListener{

            trackName = "Circuit Zandvoort"
            trackCountry = "Netherlands"
            trackDate = "5 September 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[10])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val monzaImageView = findViewById<ImageView>(R.id.monza)
        monzaImageView.setOnClickListener{

            trackName = "Monza"
            trackCountry = "Italy"
            trackDate = "12 September 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[11])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val russiaImageView = findViewById<ImageView>(R.id.russia)
        russiaImageView.setOnClickListener{

            trackName = "Sochi Street Circuit"
            trackCountry = "Russia"
            trackDate = "26 September 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[12])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val japanImageView = findViewById<ImageView>(R.id.japan)
        japanImageView.setOnClickListener{

            trackName = "Suzuka International"
            trackCountry = "Japan"
            trackDate = "10 October 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[13])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val usaImageView = findViewById<ImageView>(R.id.usa)
        usaImageView.setOnClickListener{

            trackName = "Circuit Americas"
            trackCountry = "United States"
            trackDate = "24 October 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[14])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val mexicoImageView = findViewById<ImageView>(R.id.mexico)
        mexicoImageView.setOnClickListener{

            trackName = "Autodromo Hermanos Rodriguez"
            trackCountry = "Mexico"
            trackDate = "31 October 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[15])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val brazilImageView = findViewById<ImageView>(R.id.brazil)
        brazilImageView.setOnClickListener{

            trackName = "Interlagos"
            trackCountry = "Brazil"
            trackDate = "7 November 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[16])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val australiaImageView = findViewById<ImageView>(R.id.australia)
        australiaImageView.setOnClickListener{

            trackName = "Circuit Montreal"
            trackCountry = "Australia"
            trackDate = "21 November 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[17])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val saudiImageView = findViewById<ImageView>(R.id.saudi)
        saudiImageView.setOnClickListener{

            trackName = "Jeddah City Circuit"
            trackCountry = "Saudi Arabia"
            trackDate = "5 December 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[18])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

        val uaeImageView = findViewById<ImageView>(R.id.uae)
        uaeImageView.setOnClickListener{

            trackName = "Yas Marina Circuit"
            trackCountry = "Abu Dhabi"
            trackDate = "12 December 2021"
            raceWinner = "Race is in future"

            val intent = Intent(this@RaceCalendar,Details::class.java)
            intent.putExtra("ImageTrack",trackImageIDs[19])
            intent.putExtra("trackName", trackName)
            intent.putExtra("trackCountry",trackCountry)
            intent.putExtra("trackDate",trackDate)
            intent.putExtra("trackWinner",raceWinner)

            startActivity(intent)

        }

    }
}