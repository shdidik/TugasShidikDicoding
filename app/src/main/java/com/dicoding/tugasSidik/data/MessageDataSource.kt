package com.app.tugas.data

import com.app.tugas.domain.MessageEntity

class MessageDataSource {
    fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}