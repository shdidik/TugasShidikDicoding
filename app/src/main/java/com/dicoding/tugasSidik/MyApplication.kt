package com.dicoding.tugasSidik

import android.app.Application
import com.dicoding.tugasSidik.core.di.databaseModule
import com.dicoding.tugasSidik.core.di.networkModule
import com.dicoding.tugasSidik.core.di.repositoryModule
import com.dicoding.tugasSidik.di.useCaseModule
import com.dicoding.tugasSidik.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}