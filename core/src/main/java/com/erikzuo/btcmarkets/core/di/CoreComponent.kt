/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.core.di

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class
    ]
)
interface CoreComponent {

    @Component.Builder
    interface Builder {
        fun build(): CoreComponent
    }

    fun provideOkHttpClient(): OkHttpClient
    fun provideGson(): Gson
    fun provideGsonConverterFactory(): GsonConverterFactory
    fun provideCallAdapterFactory(): CoroutineCallAdapterFactory
}