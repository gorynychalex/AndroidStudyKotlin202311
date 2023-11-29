package ru.popovich.app03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent: Intent = getIntent()

        findViewById<TextView>(R.id.textView01SecondActivity)
            .setText(
                intent.getStringExtra("key1")
            )
    }
}