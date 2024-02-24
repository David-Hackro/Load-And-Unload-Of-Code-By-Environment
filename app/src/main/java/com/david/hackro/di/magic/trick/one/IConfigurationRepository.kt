package com.david.hackro.di.magic.trick.one

// Interface defining the contract for obtaining current text in the application
interface IConfigurationRepository {

    // Function to retrieve the current text; to be implemented by classes using this interface
    fun getCurrentText(): String
}