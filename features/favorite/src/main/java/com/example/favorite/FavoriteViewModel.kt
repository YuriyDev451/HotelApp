package com.example.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.useCase.dbUseCase.GetAllItemsUseCase
import com.example.domain.useCase.dbUseCase.InsertItemUseCase
import com.example.entities.uimodel.HotelListUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(private val getAllItem: GetAllItemsUseCase): ViewModel() {




    fun getAll() : LiveData<List<HotelListUIModel>> {
        return getAllItem.getAllItems()
    }


}