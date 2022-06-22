package com.example.speisekarteapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.speisekarteapp.databinding.ActivityMainBinding
import kotlin.math.round

/**
 * Main Activity, dient als Einstiegspunkt für die App
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun oncreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,
        R.layout.activity_main)
    }

    /* -------------------- Klassen Variablen -------------------- */
    private var bill: Float = 0f
    private val drink1 = Drink("Kaffee", 3.95f)
    private val drink2 = Drink("Wein", 4.20f)
    private val drink3 = Drink("Cocktail", 6.90f)

    /* -------------------- Lifecycle -------------------- */
    /**
     * Lifecycle Funktion, wird aufgerufen wenn Activity erstellt wird
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Lege hier die Binding Variable an
        // TODO Schreibe hier deinen Code

        // Setze hier die Namen, Preise und Count in der View über die binding Variable
        // TODO Schreibe hier deinen Code

        // implementiere einen onClicklistener für das Kaffee Icon
        // TODO Schreibe hier deinen Code

        // implementiere einen onClicklistener für das Wein Icon
        // TODO Schreibe hier deinen Code

        // implementiere einen onClicklistener für das Cocktail Icon
        // TODO Schreibe hier deinen Code
    }

    /**
     * Diese Funktion addiert den Preis zur Rechnung
     */
    private fun addToBill(price: Float?) {
        if (price != null) {
            bill += price
            bill = round(bill * 100) / 100
        }
    }
}
