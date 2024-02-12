package com.example.domain.useCase.dbUseCase

import com.example.data.database.HotelsDbModel
import com.example.data.database.HotelsDbRepository
import com.example.entities.uimodel.HotelListUIModel
import javax.inject.Inject

class InsertItemUseCase@Inject constructor(val dbRepository: HotelsDbRepository) {
    suspend fun insert(item: HotelListUIModel) {
        dbRepository.insert(item)
    }
}
