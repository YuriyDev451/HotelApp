package com.example.data.di

import android.content.Context
import androidx.room.Room
import com.example.data.database.HotelsDao
import com.example.data.database.HotelsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {

    @Singleton
    @Provides
    fun provideUserDao(appDatabase: HotelsDatabase): HotelsDao {
        return appDatabase.hotelsDao()
    }

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): HotelsDatabase{
        return Room
            .databaseBuilder(
                context,
                HotelsDatabase::class.java,
                "database"
            )
            .build()
    }

}