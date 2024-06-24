package ru.popovich.app05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "db01"
        )
            .allowMainThreadQueries()
            .build()

        val userDao = db.userDao()
        val questionDao = db.questionDao()
        questionDao.insertAll(
            Question(1,"What is your name"),
            Question(2,"How old are you"),
        )

        userDao.insertAll(
            User(1,"Alex","Pupkin"),
            User(2,"Oleg","Sidorov"),
            )

        val users: List<User> = userDao.getAll()
        val questions: List<Question> = questionDao.getAll()

        Log.d(TAG, users.toString())
        Log.d(TAG, questions.toString())
    }
}