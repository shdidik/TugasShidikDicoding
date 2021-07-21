package com.app.tugas.di

import com.app.tugas.data.MessageDataSource
import com.app.tugas.data.MessageRepository
import com.app.tugas.domain.GetMessageUseCase

object Injection {
    fun provideUseCase(): GetMessageUseCase {
        val messageRepository = provideRepository()
        return GetMessageUseCase(messageRepository)
    }

    private fun provideRepository(): MessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}
