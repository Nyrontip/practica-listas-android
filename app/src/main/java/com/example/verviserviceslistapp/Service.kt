package com.example.verviserviceslistapp

data class Service(
    val id: String,
    val title: String,
    val location: String,
    val price: String,
    val applicationCount: Int,
    val isUrgent: Boolean,
    val imageUrl: String,
    val category: ServiceType
)

enum class ServiceType {
    HOGAR,
    SALUD,
    DISENO,
    GASTRONOMIA,
    JARDINERIA,
    MUSICA,
    TECNOLOGIA,
    EDUCACION,
    ARTE
}

object serviceSingleton {
    val services = mutableListOf(
        Service(
            id = "1",
            title = "Reparación de Plomería",
            location = "Ciudad de México",
            price = "$500",
            applicationCount = 3,
            isUrgent = true,
            imageUrl = "https://images.unsplash.com/photo-1585771724684-38269d6639fd?w=200&h=200&fit=crop",
            category = ServiceType.HOGAR
        ),
        Service(
            id = "2",
            title = "Clases de Yoga",
            location = "Guadalajara",
            price = "$200 por sesión",
            applicationCount = 5,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1506126613408-eca07ce68773?w=200&h=200&fit=crop",
            category = ServiceType.SALUD
        ),
        Service(
            id = "3",
            title = "Diseño Gráfico",
            location = "Monterrey",
            price = "$1500 por proyecto",
            applicationCount = 2,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1561070791-2526d30994b5?w=200&h=200&fit=crop",
            category = ServiceType.DISENO
        ),
        Service(
            id = "4",
            title = "Clases de Cocina",
            location = "Puebla",
            price = "$300 por sesión",
            applicationCount = 4,
            isUrgent = true,
            imageUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=200&h=200&fit=crop",
            category = ServiceType.GASTRONOMIA
        ),
        Service(
            id = "5",
            title = "Mantenimiento de Jardines",
            location = "Tijuana",
            price = "$400 por semana",
            applicationCount = 1,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=200&h=200&fit=crop",
            category = ServiceType.JARDINERIA
        ),
        Service(
            id = "6",
            title = "Clases de Piano",
            location = "León",
            price = "$250 por sesión",
            applicationCount = 6,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1464983953574-0892a716854b?w=200&h=200&fit=crop",
            category = ServiceType.MUSICA
        ),
        Service(
            id = "7",
            title = "Reparación de Computadoras",
            location = "Querétaro",
            price = "$600 por servicio",
            applicationCount = 2,
            isUrgent = true,
            imageUrl = "https://images.unsplash.com/photo-1517694712202-14dd9538aa97?w=200&h=200&fit=crop",
            category = ServiceType.TECNOLOGIA
        ),
        Service(
            id = "8",
            title = "Clases de Idiomas",
            location = "Cancún",
            price = "$350 por sesión",
            applicationCount = 3,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1488190211105-8b0e65b80b4e?w=200&h=200&fit=crop",
            category = ServiceType.EDUCACION
        ),
        Service(
            id = "9",
            title = "Servicio de Limpieza",
            location = "Mérida",
            price = "$300 por servicio",
            applicationCount = 4,
            isUrgent = false,
            imageUrl = "https://images.unsplash.com/photo-1515378791036-0648a3ef77b2?w=200&h=200&fit=crop",
            category = ServiceType.HOGAR
        ),
        Service(
            id = "10",
            title = "Clases de Fotografía",
            location = "San Luis Potosí",
            price = "$400 por sesión",
            applicationCount = 5,
            isUrgent = true,
            imageUrl = "https://images.unsplash.com/photo-1502920917128-1aa500764cbd?w=200&h=200&fit=crop",
            category = ServiceType.ARTE
        )
    )
}
