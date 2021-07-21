package com.dicoding.tugasSidik.detail

import androidx.lifecycle.ViewModel
import com.dicoding.tugasSidik.core.domain.model.Tourism
import com.dicoding.tugasSidik.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

