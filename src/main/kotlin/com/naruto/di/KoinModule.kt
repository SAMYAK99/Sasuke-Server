package com.naruto.di

import com.naruto.repositories.HeroRepository
import com.naruto.repositories.HeroRepositoryImpl
import org.koin.dsl.module


val koinModule  = module {

    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}