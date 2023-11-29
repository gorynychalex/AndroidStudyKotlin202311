package ru.popovich.app03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var s = "Привет из первого экрана!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java).apply {
                putExtra("key1",s)
            }

            startActivity(secondActivityIntent)
        }

    }
}