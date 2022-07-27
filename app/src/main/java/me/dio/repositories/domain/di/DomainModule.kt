package me.dio.repositories.domain.di

import me.dio.repositories.domain.ListUserRepositoriesUseCase
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.core.context.loadKoinModules

object DomainModule {

    fun load(){
        loadKoinModules(useCaseModule())
    }
    private fun useCaseModule(): Module {
        return module{
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }
}