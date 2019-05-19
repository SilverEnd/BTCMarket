/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.network

import retrofit2.HttpException
import retrofit2.Response

open class BaseRepository {
    suspend fun <T : Any> callApi(call: suspend () -> Response<T>): Result<T> {
        val response = call()

        return if (response.isSuccessful) {
            Result.Success(response.bodyOrThrow())
        } else {
            Result.Error(response.toException())
        }
    }
}

private fun <T> Response<T>.bodyOrThrow(): T {
    if (!isSuccessful) throw HttpException(this)
    return body()!!
}

private fun <T> Response<T>.toException() = HttpException(this)
