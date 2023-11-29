package ru.popovich.app04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    val fragmentManager1 = supportFragmentManager

    var b: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.button01)
            .setOnClickListener {

                if (b) {
                    fragmentManager1.beginTransaction()
                        .add(
                            R.id.fragment_container_view_01,
                            BlankFragment.newInstance(),
                            "fragment1"
                        )
                        .commit()
                } else {
                    fragmentManager1.beginTransaction()
                        .add(
                            R.id.fragment_container_view_01,
                            BlankFragment2.newInstance("one","two"),
                            "fragment2"
                        )
                        .commit()
                }
                b = !b

            }
    }
}