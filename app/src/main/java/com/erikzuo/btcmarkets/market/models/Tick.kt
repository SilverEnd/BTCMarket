/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market.models


import com.google.gson.annotations.SerializedName

data class Tick(
    @SerializedName("bestAsk")
    val bestAsk: Double,
    @SerializedName("bestBid")
    val bestBid: Int,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("instrument")
    val instrument: String,
    @SerializedName("lastPrice")
    val lastPrice: Int,
    @SerializedName("timestamp")
    val timestamp: Int,
    @SerializedName("volume24h")
    val volume24h: Double
)