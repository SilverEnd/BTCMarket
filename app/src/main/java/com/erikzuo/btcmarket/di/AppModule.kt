/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarket.di

import android.content.Context
import com.erikzuo.btcmarket.BTCMarketApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideContext(application: BTCMarketApplication): Context = application.applicationContext

}