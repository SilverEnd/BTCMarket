/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market

import com.erikzuo.btcmarkets.market.models.Tick
import com.erikzuo.btcmarkets.network.Result

interface MarketRepository {
    suspend fun getTick(): Result<Tick>
}