package com.example.data.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.entities.uimodel.HotelListUIModel
import javax.inject.Inject


interface HotelsRepositoryInterface {


}

class HotelsDbRepository @Inject constructor(private val hotelsDao: HotelsDao) {

    private val mapper = MapHotelList()

    suspend fun insert(note: HotelListUIModel) {
        hotelsDao.insert(mapper.mapEntityToDbModel(note))
    }

   /* suspend fun delete(note: HotelsDbModel) {
        hotelsDao.delete(note)
    }*/

    fun getAll(): LiveData<List<HotelListUIModel>> = MediatorLiveData<List<HotelListUIModel>>().apply {
        addSource(hotelsDao.getAll()){
            value = mapper.mapListDbModelToListEntity(it)
        }
    }

}