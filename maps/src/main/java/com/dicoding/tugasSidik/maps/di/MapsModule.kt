package com.dicoding.tugasSidik.maps.di

import com.dicoding.tugasSidik.maps.MapsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mapsModule = module {
    viewModel { MapsViewModel(get()) }
}