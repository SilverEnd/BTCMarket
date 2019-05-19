/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market

import com.erikzuo.btcmarkets.market.models.Tick
import retrofit2.Response
import retrofit2.http.GET

interface MarketDataService {
    companion object {
        const val BASE_URL = "https://api.btcmarkets.net"
    }

    @GET("/market/BTC/AUD/tick")
    fun getMarketTick(): Response<Tick>
}