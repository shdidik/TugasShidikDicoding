package com.dicoding.tugasSidik.mainContinuous

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.tugas.di.Injection
import com.app.tugas.domain.GetMessageUseCase

class MainViewModelFactory (
    private var getMessageUseCase: GetMessageUseCase
) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(getMessageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}