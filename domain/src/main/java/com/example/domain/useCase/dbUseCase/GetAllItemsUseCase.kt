package com.example.domain.useCase.dbUseCase

import androidx.lifecycle.LiveData
import com.example.data.database.HotelsDbModel
import com.example.data.database.HotelsDbRepository
import javax.inject.Inject

class GetAllItemsUseCase @Inject constructor(val dbRepository: HotelsDbRepository) {
    fun getAllItems(): LiveData<List<HotelsDbModel>> {
        return dbRepository.getAll()
    }
}