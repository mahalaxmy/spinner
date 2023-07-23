package com.example.spinnerkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = findViewById<EditText>(R.id.et)
        var b = findViewById<EditText>(R.id.et2)
        var c = findViewById<Button>(R.id.button)
        var d = findViewById<Spinner>(R.id.spinner)
        var tv = findViewById<TextView>(R.id.tv)
        c.setOnClickListener({
            var i: Int =a.text.toString().toInt()
            var j: Int = b.text.toString().toInt()
            var ans: Int = 0
            if (d.selectedItem.toString() == "Add")
                ans = i + j
            else if (d.selectedItem.toString() == "Sub")
                ans = i - j
            else if (d.selectedItem.toString() == "Mul")
                ans = i * j
            else (d.selectedItem.toString() == "Div")
                ans=i/j

            tv.text = ans.toString()
        })





    }
}