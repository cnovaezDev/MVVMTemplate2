package com.example.mvvmtemplate.data.database.dao

import androidx.room.*
import com.example.mvvmtemplate.data.database.entities.QuoteEntity

@Dao
interface QuoteDao {

    @Query("Select * From quote_table Order by author DESC")
    suspend fun getAllQuotes(): List<QuoteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(quotes:List<QuoteEntity>)

    @Query("Delete From quote_table")
    suspend fun deleteAllQuotes()
}