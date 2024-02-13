package com.example.domain.useCase.dbUseCase

import com.example.data.database.HotelsDbModel
import com.example.data.database.HotelsDbRepository
import com.example.entities.uimodel.HotelListUIModel
import javax.inject.Inject

class DeleteItemUseCase @Inject constructor(val dbRepository: HotelsDbRepository) {
    suspend fun delete(item: HotelListUIModel) {
        dbRepository.delete(item)
    }
}