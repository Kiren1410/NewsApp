package com.kirenraj.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kirenraj.data.model.TableModel

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(news: TableModel)

    @Query("SELECT * FROM News_Table")
    fun getNewsFromDatabase(): LiveData<List<TableModel>>

    @Delete
    fun deleteNews(news: TableModel)
}