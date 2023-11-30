package ru.popovich.app05

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class,Question::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun questionDao(): QuestionDao
}