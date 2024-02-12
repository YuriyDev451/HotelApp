package com.example.data.database


import com.example.entities.uimodel.HotelListUIModel

class MapHotelList(){

    fun mapEntityToDbModel(input : HotelListUIModel) = HotelsDbModel(
        idi = 0,
        id = input.id,
            name = input.name,
            address = input.address,
            country = input.country,
            city = input.city,
            reviewScore = input.reviewScore,
            startRating = input.startRating,
            checkInTime = input.checkInTime,
            checkOutTime = input.checkOutTime,
            cityCenterDistance = input.cityCenterDistance,
            cityCenterDistanceName = input.cityCenterDistanceName,
            thumbnailImage = input.thumbnailImage,
            price = input.price,
            roomName = input.roomName
    )

    fun mapDbModelToEntity(input : HotelsDbModel) = HotelListUIModel(
        id = input.id,
        name = input.name,
        address = input.address,
        country = input.country,
        city = input.city,
        reviewScore = input.reviewScore,
        startRating = input.startRating,
        checkInTime = input.checkInTime,
        checkOutTime = input.checkOutTime,
        cityCenterDistance = input.cityCenterDistance,
        cityCenterDistanceName = input.cityCenterDistanceName,
        thumbnailImage = input.thumbnailImage,
        price = input.price,
        roomName = input.roomName
    )


    fun mapListDbModelToListEntity(list: List<HotelsDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}












//class MapHotelListUIModelToDbModel: BaseMapper<HotelListUIModel, HotelsDbModel> {
//    override fun map(input: HotelListUIModel): HotelsDbModel {
//        return HotelsDbModel(
//            id = input.id,
//            name = input.name,
//            address = input.address,
//            country = input.country,
//            city = input.city,
//            reviewScore = input.reviewScore,
//            startRating = input.startRating,
//            checkInTime = input.checkInTime,
//            checkOutTime = input.checkOutTime,
//            cityCenterDistance = input.cityCenterDistance,
//            cityCenterDistanceName = input.cityCenterDistanceName,
//            thumbnailImage = input.thumbnailImage,
//            price = input.price,
//            roomName = input.roomName
//        )
//    }
//}
//
//class MapDbModelToHotelListUIModel: BaseMapper<HotelsDbModel, HotelListUIModel> {
//    override fun map(input: HotelsDbModel): HotelListUIModel {
//        return HotelListUIModel(
//            id = input.id,
//            name = input.name,
//            address = input.address,
//            country = input.country,
//            city = input.city,
//            reviewScore = input.reviewScore,
//            startRating = input.startRating,
//            checkInTime = input.checkInTime,
//            checkOutTime = input.checkOutTime,
//            cityCenterDistance = input.cityCenterDistance,
//            cityCenterDistanceName = input.cityCenterDistanceName,
//            thumbnailImage = input.thumbnailImage,
//            price = input.price,
//            roomName = input.roomName
//        )
//    }
//}