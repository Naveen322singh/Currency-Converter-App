package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //declaring variables and widgets
    lateinit var titletextView: TextView
    lateinit var editText:EditText
    lateinit var convertButton: Button
    lateinit var resultTextView:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing widgets
        titletextView=findViewById(R.id.textView)
        editText=findViewById(R.id.editText)
        convertButton=findViewById(R.id.convertBTN)
        resultTextView=findViewById(R.id.resultText)


        resultTextView.setOnClickListener{
            //code to be executed when the button is clicked
            var enteredUSD : String = editText.text.toString()
            var enteredUSDdouble:Double=enteredUSD.toDouble()

            var euros=makeConversion(enteredUSDdouble)

            //display the conversion result
            resultTextView.text=euros.toString()
        }
    }
    fun makeConversion(usd:Double):Double{
        return usd*0.94
    }
}