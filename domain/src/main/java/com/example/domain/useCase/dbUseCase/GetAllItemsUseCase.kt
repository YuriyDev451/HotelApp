package com.example.domain.useCase.dbUseCase

import androidx.lifecycle.LiveData
import com.example.data.database.HotelsDbModel
import com.example.data.database.HotelsDbRepository
import com.example.entities.uimodel.HotelListUIModel
import javax.inject.Inject

class GetAllItemsUseCase @Inject constructor(val dbRepository: HotelsDbRepository) {
    fun getAllItems(): LiveData<List<HotelListUIModel>> {
        return dbRepository.getAll()
    }
}