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

  /* -------------------- Klassen Variablen -------------------- */
  private var bill: Float = 0f
  private val drink1 = Drink("Kaffee", 3.95f)
  private val drink2 = Drink("Wein", 4.20f)
  private val drink3 = Drink("Cocktail", 6.90f)

  /* -------------------- Lifecycle -------------------- */
  /**
   * Lifecycle Funktion, wird aufgerufen wenn Activity erstellt wird
   */

  // Lege hier die Binding Variable an
  // TODO Schreibe hier deinen Code
  private lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_main
    )

    // Setze hier die Namen, Preise und Count in der View über die binding Variable
    // TODO Schreibe hier deinen Code
    binding.drink1Name.text = drink1.name
    binding.drink1Price.text = drink1.price.toString()
    binding.drink1Count.text = drink1.count.toString()

    binding.drink2Name.text = drink2.name
    binding.drink2Price.text = drink2.price.toString()
    binding.drink2Count.text = drink2.count.toString()


    binding.drink3Name.text = drink3.name
    binding.drink3Price.text = drink3.price.toString()
    binding.drink3Count.text = drink3.count.toString()


    // implementiere einen onClicklistener für das Kaffee Icon
    // TODO Schreibe hier deinen Code
    binding.drink1Button.setOnClickListener {
      addToBill(drink1.price)
      drink1.count += 1
      binding.drink1Count.text = drink1.count.toString()
      binding.totalPrice.text = bill.toString()

    }

    // implementiere einen onClicklistener für das Wein Icon
    // TODO Schreibe hier deinen Code

    binding.drink2Button.setOnClickListener {
      addToBill(drink2.price)
      drink2.count += 1
      binding.drink2Count.text = drink2.count.toString()
      binding.totalPrice.text = bill.toString()


    }

    // implementiere einen onClicklistener für das Cocktail Icon
    // TODO Schreibe hier deinen Code

    binding.drink3Button.setOnClickListener {
      addToBill(drink3.price)
      drink3.count += 1
      binding.drink3Count.text = drink3.count.toString()
      binding.totalPrice.text = bill.toString()


    }

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
