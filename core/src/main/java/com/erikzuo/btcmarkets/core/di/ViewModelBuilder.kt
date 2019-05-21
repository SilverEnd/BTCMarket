/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.core.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelBuilder {
    @Binds
    internal abstract fun bindViewModelFactory(factory: BTCMarketViewModelFactory): ViewModelProvider.Factory
}