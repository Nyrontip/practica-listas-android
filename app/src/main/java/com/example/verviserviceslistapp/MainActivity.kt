package com.example.verviserviceslistapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.verviserviceslistapp.ui.theme.VerviServicesListAppTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VerviServicesListAppTheme {
                MainScreen()   
            }
        }
    }
}

@Composable
fun MainScreen(){
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                Text(
                    text = "Servicios Disponibles", 
                    style = MaterialTheme.typography.headlineMedium, 
                    modifier = Modifier.padding(16.dp)
                )
                LazyColumn {
                    items(services) { service ->
                        ServiceItem(service = service, onClick = {
                            Toast.makeText(context, "Seleccionaste: ${service.title}", Toast.LENGTH_SHORT).show()
                        })
                    }
                }
            }
        }
    )
}

data class Service(
    val id: String,
    val title: String,
    val location: String,
    val price: String,
    val applicationCount: Int,
    val isUrgent: Boolean,
    val imageUrl: String,
    val category: String
)

val services = listOf(
    Service(
        id = "1",
        title = "Reparación de Plomería",
        location = "Ciudad de México",
        price = "$500",
        applicationCount = 3,
        isUrgent = true,
        imageUrl = "https://images.unsplash.com/photo-1585771724684-38269d6639fd?w=200&h=200&fit=crop",
        category = "Hogar"
    ),
    Service(
        id = "2",
        title = "Clases de Yoga",
        location = "Guadalajara",
        price = "$200 por sesión",
        applicationCount = 5,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1506126613408-eca07ce68773?w=200&h=200&fit=crop",
        category = "Salud"
    ),
    Service(
        id = "3",
        title = "Diseño Gráfico",
        location = "Monterrey",
        price = "$1500 por proyecto",
        applicationCount = 2,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1561070791-2526d30994b5?w=200&h=200&fit=crop",
        category = "Diseño"
    ),
    Service(
        id = "4",
        title = "Clases de Cocina",
        location = "Puebla",
        price = "$300 por sesión",
        applicationCount = 4,
        isUrgent = true,
        imageUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=200&h=200&fit=crop",
        category = "Gastronomía"
    ),
    Service(
        id = "5",
        title = "Mantenimiento de Jardines",
        location = "Tijuana",
        price = "$400 por semana",
        applicationCount = 1,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=200&h=200&fit=crop",
        category = "Jardinería"
    ),
    Service(
        id = "6",
        title = "Clases de Piano",
        location = "León",
        price = "$250 por sesión",
        applicationCount = 6,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1464983953574-0892a716854b?w=200&h=200&fit=crop",
        category = "Música"
    ),
    Service(
        id = "7",
        title = "Reparación de Computadoras",
        location = "Querétaro",
        price = "$600 por servicio",
        applicationCount = 2,
        isUrgent = true,
        imageUrl = "https://images.unsplash.com/photo-1517694712202-14dd9538aa97?w=200&h=200&fit=crop",
        category = "Tecnología"
    ),
    Service(
        id = "8",
        title = "Clases de Idiomas",
        location = "Cancún",
        price = "$350 por sesión",
        applicationCount = 3,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1488190211105-8b0e65b80b4e?w=200&h=200&fit=crop",
        category = "Educación"
    ),
    Service(
        id = "9",
        title = "Servicio de Limpieza",
        location = "Mérida",
        price = "$300 por servicio",
        applicationCount = 4,
        isUrgent = false,
        imageUrl = "https://images.unsplash.com/photo-1515378791036-0648a3ef77b2?w=200&h=200&fit=crop",
        category = "Hogar"
    ),
    Service(
        id = "10",
        title = "Clases de Fotografía",
        location = "San Luis Potosí",
        price = "$400 por sesión",
        applicationCount = 5,
        isUrgent = true,
        imageUrl = "https://images.unsplash.com/photo-1502920917128-1aa500764cbd?w=200&h=200&fit=crop",
        category = "Arte"
    )
)


@Composable
fun ServiceItem ( service: Service , onClick: () -> Unit = {}) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        onClick = onClick
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            val context = LocalContext.current
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(service.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = service.title,
                placeholder = painterResource(id = R.drawable.ic_launcher_background),
                error = painterResource(id = R.drawable.ic_launcher_foreground),
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = service.title, style = MaterialTheme.typography.titleMedium)
                Text(text = service.location, style = MaterialTheme.typography.bodyMedium)
                Text(text = service.price, style = MaterialTheme.typography.bodyMedium)
                if (service.isUrgent) {
                    Text(text = "¡Urgente!", color = Color.Red, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
