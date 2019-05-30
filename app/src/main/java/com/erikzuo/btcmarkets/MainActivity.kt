/*
 * Copyright (c) 2019 Yifan(Erik) Zuo.  All rights reserved.
 */

package com.erikzuo.btcmarkets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.erikzuo.btcmarkets.R
import com.erikzuo.btcmarkets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var layoutBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        layoutBinding.button.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainActivity_to_marketFragment)
        }
    }
}
