/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets

import android.app.Activity
import android.app.Application
import android.content.Context
import com.erikzuo.btcmarkets.di.CoreComponent
import com.erikzuo.btcmarkets.di.DaggerCoreComponent

class BTCMarketApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.create()
    }

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) = (context.applicationContext as BTCMarketApplication).coreComponent
    }
}

fun Activity.coreComponent() = BTCMarketApplication.coreComponent(this)
