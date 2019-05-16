/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarket.di

import com.erikzuo.btcmarket.BTCMarketApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NetworkModule::class
])
interface AppComponent : AndroidInjector<BTCMarketApplication> {
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<BTCMarketApplication>
}