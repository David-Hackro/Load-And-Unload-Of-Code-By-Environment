package com.david.hackro.di.magic.trick.one.di

import com.david.hackro.di.magic.trick.one.IConfigurationRepository
import com.david.hackro.di.magic.trick.one.configuration.ConfigurationRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Dagger Module for providing dependencies related to IConfigurationRepository
@Module
@InstallIn(SingletonComponent::class)
internal class ExampleModule {

    // Provides a singleton instance of IConfigurationRepository using ConfigurationRepositoryImpl
    @Provides
    @Singleton
    fun provideRepository(): IConfigurationRepository = ConfigurationRepositoryImpl()

}
