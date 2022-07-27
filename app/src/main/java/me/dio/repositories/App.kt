package me.dio.repositories

import android.app.Application
import me.dio.repositories.data.di.DataModule
import me.dio.repositories.domain.di.DomainModule
import me.dio.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate(){
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}