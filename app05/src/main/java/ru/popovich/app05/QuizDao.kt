package ru.popovich.app05

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {
    @Query("SELECT * FROM question")
    fun getAll(): List<Question>

    @Query("SELECT * FROM question WHERE id IN (:questionId)")
    fun getById(questionId: Int): Question

    @Query("SELECT * FROM question WHERE text LIKE :text")
    fun findByText(text: String): List<Question>

    @Insert
    fun insertAll(vararg question: Question)

    @Delete
    fun delete(question: Question)
}