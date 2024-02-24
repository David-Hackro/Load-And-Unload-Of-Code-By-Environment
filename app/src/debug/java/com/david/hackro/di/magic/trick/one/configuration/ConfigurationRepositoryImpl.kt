// This class is part of the 'configuration' package for the debug environment
package com.david.hackro.di.magic.trick.one.configuration

import com.david.hackro.di.magic.trick.one.IConfigurationRepository
import javax.inject.Inject

// Implementation of the IConfigurationRepository interface for the debug environment
class ConfigurationRepositoryImpl @Inject constructor() : IConfigurationRepository {

    // Implementation of the getCurrentText function, returns a fixed string for the debug environment
    override fun getCurrentText(): String {
        return "Debug"
    }
}
