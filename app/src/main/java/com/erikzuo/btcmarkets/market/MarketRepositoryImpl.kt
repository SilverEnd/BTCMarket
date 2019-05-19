/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market

import com.erikzuo.btcmarkets.market.models.Tick
import com.erikzuo.btcmarkets.network.BaseRepository
import com.erikzuo.btcmarkets.network.Result

class MarketRepositoryImpl(
    private val marketDataService: MarketDataService
) : MarketRepository, BaseRepository() {

    override suspend fun getTick(): Result<Tick> {
        return callApi {
            marketDataService.getMarketTick()
        }
    }
}