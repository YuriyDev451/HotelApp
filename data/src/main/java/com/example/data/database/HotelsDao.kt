package com.example.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface HotelsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(hotel: HotelsDbModel)

    @Delete
    suspend fun delete(hotel: HotelsDbModel)


    @Query("SELECT * FROM hotelsdbmodel")
    fun getAll() : LiveData<List<HotelsDbModel>>


}