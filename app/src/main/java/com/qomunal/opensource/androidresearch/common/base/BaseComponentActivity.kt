package com.qomunal.opensource.androidresearch.common.base

import android.os.Bundle
import androidx.activity.ComponentActivity

/**
 * Created by faisalamircs on 24/12/2024
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


abstract class BaseComponentActivity : ComponentActivity() {

    abstract fun initUI()
    abstract fun initObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
        initObserver()
    }

}