/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets.market.di

import com.erikzuo.btcmarkets.di.CoreComponent
import com.erikzuo.btcmarkets.di.scope.FeatureScope
import dagger.Component


/**
 * Dagger component for [MarketActivity].
 */
@Component(
    modules = [
        MarketModule::class
    ],
    dependencies = [CoreComponent::class]
)
@FeatureScope
interface MarketComponent {

    @Component.Builder
    interface Builder {
        fun build(): MarketComponent
        fun coreComponent(coreComponent: CoreComponent): Builder
    }
}
