package com.dicoding.tugasSidik.di

import com.dicoding.tugasSidik.core.domain.usecase.TourismInteractor
import com.dicoding.tugasSidik.core.domain.usecase.TourismUseCase
import com.dicoding.tugasSidik.detail.DetailTourismViewModel
import com.dicoding.tugasSidik.favorite.FavoriteViewModel
import com.dicoding.tugasSidik.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<TourismUseCase> { TourismInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { DetailTourismViewModel(get()) }
}