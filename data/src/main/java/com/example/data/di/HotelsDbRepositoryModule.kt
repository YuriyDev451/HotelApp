//package com.example.data.di
//
//import com.example.data.HotelsRepositoryInterface
//import com.example.data.database.HotelsDbRepository
//
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//
//@Module
//@InstallIn(SingletonComponent::class)
//abstract class HotelsDbRepositoryModule {
//
//    @Binds
//    abstract  fun bindRepository(prm: HotelsDbRepository): HotelsRepositoryInterface
//}