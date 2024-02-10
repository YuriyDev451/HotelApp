package com.example.data.database

import androidx.lifecycle.LiveData
import javax.inject.Inject


interface HotelsRepositoryInterface {


}

class HotelsDbRepository @Inject constructor(private val hotelsDao: HotelsDao) {


    suspend fun insert(note: HotelsDbModel) {
        hotelsDao.insert(note)
    }

    suspend fun delete(note: HotelsDbModel) {
        hotelsDao.delete(note)
    }

    fun getAll(): LiveData<List<HotelsDbModel>> {
        return hotelsDao.getAll()
    }
}