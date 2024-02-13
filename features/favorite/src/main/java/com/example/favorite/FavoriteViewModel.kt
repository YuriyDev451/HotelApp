package com.example.favorite

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.base.BaseViewModel
import com.example.domain.useCase.dbUseCase.DeleteItemUseCase
import com.example.domain.useCase.dbUseCase.GetAllItemsUseCase
import com.example.domain.useCase.dbUseCase.InsertItemUseCase
import com.example.entities.uimodel.HotelListUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val getAllItem: GetAllItemsUseCase,
    private val deleteItemUseCase: DeleteItemUseCase
) : BaseViewModel() {


    fun delete(hotel: HotelListUIModel) {
        //try {
        // Выполняем операцию удаления объекта hotel
        viewModelScope.launch {
            deleteItemUseCase.delete(hotel)
            //    Log.e("dataB", "успех")
        }

        // } catch (e: Exception) {

        //    Log.e("dataB", "Ошибка при удалении отеля: ${e.message}", e)


        //  }


    }

    fun getAll(): LiveData<List<HotelListUIModel>> {
        return getAllItem.getAllItems()
    }


}