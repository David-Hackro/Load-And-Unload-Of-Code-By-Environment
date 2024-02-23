package com.david.hackro.di.magic.trick.one.di

import com.david.hackro.di.magic.trick.one.IConfigurationRepository
import com.david.hackro.di.magic.trick.one.configuration.ConfigurationRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class ExampleModule {
    @Provides
    @Singleton
    fun provideRepository(): IConfigurationRepository = ConfigurationRepositoryImpl()

}