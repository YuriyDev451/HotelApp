package com.example.domain.mapper

import com.example.entities.Hotels
import com.example.entities.HotelsResponse
import com.example.entities.Result
import com.example.entities.uimodel.HotelListUIModel
import com.example.entities.uimodel.HotelSearchUIState
import javax.inject.Inject

class HotelsResponseToUIStateMapper @Inject constructor(): BaseMapper<Result, HotelSearchUIState> {
    override fun map(input: Result): HotelSearchUIState {
        return HotelSearchUIState(
            hotels = input.getData()
        )
    }

    private fun Result.getData(): List<HotelListUIModel>? {
        return offers?.hotels?.map {
            HotelListUIModel(
                it.id ?: 0,
                name = it.details?.name ?: "",
                address = it.details?.address?.address ?:"",
                country = it.details?.address?.country?.name ?: "",
                city = it.details?.address?.city?.name ?: "",
                reviewScore = it.details?.reviewScore ?: 0,
                startRating = it.details?.starRating ?: 0,
                checkInTime = it.details?.checkInTime ?: "",
                checkOutTime = it.details?.checkOutTime ?: "",
                cityCenterDistance = it.details?.cityCenterPointDistance ?: 0.0,
                cityCenterDistanceName = it.details?.cityCenterPointDistanceName ?: "",
                thumbnailImage = it.details?.extra?.thumbnailImage ?: "",
                price = it.rooms?.firstOrNull()?.offers?.firstOrNull()?.price ?: 0,
                roomName = it.rooms?.firstOrNull()?.offers?.firstOrNull()?.concept?.description ?: ""

            )
        }
    }


//    private fun HotelsResponse.getData(): List<HotelListUIModel>? {
//        return result?.offers?.hotels?.map {
//            HotelListUIModel(
//                it.id ?: 0,
//                name = it.details?.name ?: "",
//                address = it.details?.address?.address ?:"",
//                country = it.details?.address?.country?.name ?: "",
//                city = it.details?.address?.city?.name ?: "",
//                reviewScore = it.details?.reviewScore ?: 0,
//                startRating = it.details?.starRating ?: 0,
//                checkInTime = it.details?.checkInTime ?: "",
//                checkOutTime = it.details?.checkOutTime ?: "",
//                cityCenterDistance = it.details?.cityCenterPointDistance ?: 0.0,
//                cityCenterDistanceName = it.details?.cityCenterPointDistanceName ?: "",
//                thumbnailImage = it.details?.extra?.thumbnailImage ?: ""
//
//            )
//        }
//    }

}