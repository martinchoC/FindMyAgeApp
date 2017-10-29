package com.fflush.findmyage

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        buttonFindMyAge.setOnClickListener{
        }
        */
    }

    fun buttonFindAgeEvent(view: View){
        val viewl: View = view
        var yearOfBirth:String = editTextYear.text.toString()
        if(yearOfBirth == ""){
            textViewShowAge.text = "Invalid input year"
        }
        else {
            var yourAge = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth.toInt()
            textViewShowAge.text = "You are $yourAge years old"
        }
        viewl.hideKeyboard()
        }

    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }


}
