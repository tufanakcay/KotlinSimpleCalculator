package com.tufanakcay.kotlinsimplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tufanakcay.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var myString : String
    private lateinit var binding: ActivityMainBinding

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        myString = ""

    }

    @SuppressLint("SetTextI18n")
    fun mySum(view : View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.resultText.text = "Result: $result"
        }




    }

    @SuppressLint("SetTextI18n")
    fun mySub(view : View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            binding.resultText.text = "Result: $result"
        }


    }

    @SuppressLint("SetTextI18n")
    fun myMultiply(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            binding.resultText.text = "Result: $result"
        }


    }

    @SuppressLint("SetTextI18n")
    fun myDiv(view: View) {

        number1 = binding.editText.text.toString().toIntOrNull()
        number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultText.text = "Error!"

        } else {
            result = number1!! / number2!!
            binding.resultText.text = "Result: $result"
        }

    }





}