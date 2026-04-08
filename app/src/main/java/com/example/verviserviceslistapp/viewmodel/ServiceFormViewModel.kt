package com.example.verviserviceslistapp.viewmodel

import android.net.Uri
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import com.example.verviserviceslistapp.Service
import com.example.verviserviceslistapp.ServiceType
import com.example.verviserviceslistapp.serviceSingleton
import java.util.Locale

class ServiceFormViewModel : ViewModel() {
    // Estados del formulario
    private val _title = mutableStateOf("")
    val title: State<String> = _title

    private val _location = mutableStateOf("")
    val location: State<String> = _location

    private val _price = mutableStateOf("")
    val price: State<String> = _price

    private val _applicationCount = mutableStateOf("")
    val applicationCount: State<String> = _applicationCount

    private val _isUrgent = mutableStateOf(false)
    val isUrgent: State<Boolean> = _isUrgent

    private val _imageUri = mutableStateOf<Uri?>(null)
    val imageUri: State<Uri?> = _imageUri

    private val _expanded = mutableStateOf(false)
    val expanded: State<Boolean> = _expanded

    private val _selectedCategory = mutableStateOf(ServiceType.HOGAR)
    val selectedCategory: State<ServiceType> = _selectedCategory

    // Métodos para actualizar estados
    fun setTitle(value: String) {
        _title.value = value
    }

    fun setLocation(value: String) {
        _location.value = value
    }

    fun setPrice(value: String) {
        _price.value = value
    }

    fun setApplicationCount(value: String) {
        // Solo permitir dígitos
        _applicationCount.value = value.filter { it.isDigit() }
    }

    fun setIsUrgent(value: Boolean) {
        _isUrgent.value = value
    }

    fun setImageUri(uri: Uri?) {
        _imageUri.value = uri
    }

    fun setExpanded(value: Boolean) {
        _expanded.value = value
    }

    fun setSelectedCategory(category: ServiceType) {
        _selectedCategory.value = category
        _expanded.value = false
    }

    fun isFormValid(): Boolean {
        return title.value.isNotBlank() &&
                location.value.isNotBlank() &&
                price.value.isNotBlank() &&
                applicationCount.value.isNotBlank() &&
                imageUri.value != null
    }

    fun saveService(): Service? {
        if (!isFormValid()) {
            return null
        }

        val newService = Service(
            id = System.currentTimeMillis().toString(),
            title = title.value,
            location = location.value,
            price = price.value,
            applicationCount = applicationCount.value.toIntOrNull() ?: 0,
            isUrgent = isUrgent.value,
            imageUrl = imageUri.value.toString(),
            category = selectedCategory.value
        )

        serviceSingleton.services.add(newService)
        return newService
    }

    fun resetForm() {
        _title.value = ""
        _location.value = ""
        _price.value = ""
        _applicationCount.value = ""
        _isUrgent.value = false
        _imageUri.value = null
        _expanded.value = false
        _selectedCategory.value = ServiceType.HOGAR
    }

    fun getCategoryDisplayName(category: ServiceType): String {
        return category.name.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString()
        }
    }
}

