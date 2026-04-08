package com.example.verviserviceslistapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.example.verviserviceslistapp.Service
import com.example.verviserviceslistapp.serviceSingleton

class ServiceListViewModel : ViewModel() {
    private val _services = mutableStateOf(serviceSingleton.services)
    val services: State<List<Service>> = _services

    init {
        // Inicializar con los servicios del singleton
        _services.value = serviceSingleton.services
    }

    fun getServices(): List<Service> {
        return serviceSingleton.services
    }
}

