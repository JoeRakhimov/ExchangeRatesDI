package com.joerakhimov.exchangeratesdi.di

import com.joerakhimov.exchangeratesdi.data.Api
import com.joerakhimov.exchangeratesdi.data.BASE_URL
import com.joerakhimov.niceweatherdi.data.RemoteRepository
import com.joerakhimov.niceweatherdi.data.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApi(): Api =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)

    @Provides
    fun provideRepository(api: Api): Repository = RemoteRepository(api)
}