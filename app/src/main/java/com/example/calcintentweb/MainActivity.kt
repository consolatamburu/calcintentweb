package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonCalc: Button
    lateinit var buttonIntent:Button
    lateinit var buttonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalc=findViewById(R.id.btn_calc)
        buttonIntent=findViewById(R.id.btn_int)
        buttonWeb=findViewById(R.id.btn_web)

        buttonCalc.setOnClickListener {
            val intent = Intent(
                this, CalculatorActivity::class.java
            )
            startActivity(intent)
        }
        buttonIntent.setOnClickListener {
            val intent1 = Intent(
                this,IntentActivity::class.java
            )
            startActivity(intent1)
        }
        buttonWeb.setOnClickListener {
            val intent2 = Intent (
                this,WebActivity::class.java
                    )
            startActivity(intent2)
        }
    }

}