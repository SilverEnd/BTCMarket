/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market.di

import com.erikzuo.btcmarkets.di.scope.FeatureScope
import com.erikzuo.btcmarkets.market.MarketDataService
import com.erikzuo.btcmarkets.market.MarketRepository
import com.erikzuo.btcmarkets.market.MarketRepositoryImpl
import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Lazy
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class MarketModule {

    @Provides
    @FeatureScope
    fun provideDesignerNewsService(
        client: Lazy<OkHttpClient>,
        gson: Gson,
        callAdapterFactory: CoroutineCallAdapterFactory
    ): MarketDataService {
        return Retrofit.Builder()
            .baseUrl(MarketDataService.BASE_URL)
            .callFactory { client.get().newCall(it) }
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(callAdapterFactory)
            .build()
            .create(MarketDataService::class.java)
    }

    @Provides
    fun provideMarketRepository(marketDataService: MarketDataService): MarketRepository {
        return MarketRepositoryImpl(marketDataService)
    }

}