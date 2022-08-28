package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TextChange Button
        findViewById<Button>(R.id.button).setOnClickListener{
            //Button Action Listener
            Log.i("Gabriel", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.matteOrange))
        }

        //Change BackgroundView Button
        findViewById<Button>(R.id.backgroundViewButton).setOnClickListener{
            //Button Action Listener
            Log.i("Gabriel", "Tapped on background view button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(
                androidx.appcompat.R.color.material_blue_grey_800))
        }

    }
}