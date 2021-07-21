package com.app.tugas.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}