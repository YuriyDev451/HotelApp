package com.example.domain.useCase

import com.example.common.Resource
import com.example.data.HotelsRepositoryInterface
import com.example.domain.mapper.HotelsResponseToUIStateMapper
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HotelListUseCase @Inject constructor(
    private val repositoryInterface: HotelsRepositoryInterface,
    private val mapper: HotelsResponseToUIStateMapper
) {
    suspend fun getHotels() = flow {
        emit(Resource.Loading())
        repositoryInterface.getHotelList()?.let {
            emit(Resource.Success(it))
        }?: emit(Resource.Error("Error"))
    }.catch {
        emit(Resource.Error(it.localizedMessage))
    }
}





//class SearchListUseCase @Inject constructor(
//    private val repositoryInterface: HotelsRepositoryInterface,
//
//) {
//
//    //invoke()  ola biler
//
//    suspend fun getFlight() = flow{
//        emit(Resource.Loading())
//        repositoryInterface.getHotelList()?.let {
//            emit(Resource.Success(it))
//        } ?: emit(Resource.Error("Empty message error"))
//    }.catch { exception->
//        emit(Resource.Error(exception.localizedMessage))
//    }
//
//}
