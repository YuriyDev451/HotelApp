package com.example.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [HotelsDbModel::class], version = 1)
abstract class HotelsDatabase: RoomDatabase() {

    abstract fun hotelsDao(): HotelsDao
}