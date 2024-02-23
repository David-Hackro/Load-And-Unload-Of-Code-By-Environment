package com.david.hackro.di.magic.trick.one.configuration

import com.david.hackro.di.magic.trick.one.IConfigurationRepository
import javax.inject.Inject

class ConfigurationRepositoryImpl @Inject constructor() : IConfigurationRepository {

    override fun getCurrentText(): String {
        return "Release"
    }
}