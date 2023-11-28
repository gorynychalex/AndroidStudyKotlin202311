package ru.popovich.androidstudykotlin202311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var b: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {

            findViewById<TextView>(R.id.textView)
                .setText(if (b) "Новый текст" else "Старый текст")

            b = !b
        }
    }
}