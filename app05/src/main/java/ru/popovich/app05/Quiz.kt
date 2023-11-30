package ru.popovich.app05

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Quiz {
}
@Entity
data class Question (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val text: String,
)

@Entity
data class Option (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val questionId: Long,
    val text: String,
)