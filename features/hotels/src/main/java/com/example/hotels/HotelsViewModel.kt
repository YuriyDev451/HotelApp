package com.example.hotels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.common.Resource
import com.example.common.State
import com.example.domain.mapper.HotelsResponseToUIStateMapper
import com.example.domain.useCase.HotelListUseCase
import com.example.entities.uimodel.HotelListUIModel
import com.example.entities.uimodel.HotelSearchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject


@HiltViewModel
class HotelsViewModel @Inject constructor(
val hotelListUseCase: HotelListUseCase,
    private val mapper: HotelsResponseToUIStateMapper
) : ViewModel() {

    val state: MutableStateFlow<State?> = MutableStateFlow(null)

    val data  = MutableLiveData<HotelSearchUIState?>()


    suspend fun getFlights(){
        hotelListUseCase.getHotels().collectLatest {
            when(it){
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    it.data?.result?.let {
                        val mapData = mapper.map(it)
                        data.postValue(mapData)

                    }
                }

            }
        }
    }

}