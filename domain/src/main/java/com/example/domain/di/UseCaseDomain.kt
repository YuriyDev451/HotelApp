package com.example.domain.di

import com.example.data.HotelsRepositoryInterface
import com.example.domain.mapper.HotelsResponseToUIStateMapper
import com.example.domain.useCase.HotelListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseDomain {

    @Provides
    @Singleton
    fun provideUseCase(repositoryInterface: HotelsRepositoryInterface,
                       mapper: HotelsResponseToUIStateMapper
    ) = HotelListUseCase(repositoryInterface, mapper)
}