# 🏪 Vervi Services List App

Una aplicación Android moderna desarrollada con Kotlin y Jetpack Compose que permite explorar, listar y crear servicios diversos. La app proporciona una interfaz intuitiva para navegar por diferentes tipos de servicios disponibles.

## 📱 Características Principales

- **📋 Lista de Servicios**: Visualiza todos los servicios disponibles con imágenes, ubicación, precio y número de aplicaciones
- **➕ Crear Servicios**: Formulario intuitivo para añadir nuevos servicios a la plataforma
- **🏷️ Categorización**: Servicios clasificados en 9 categorías (Hogar, Salud, Diseño, Gastronomía, Jardinería, Música, Tecnología, Educación, Arte)
- **🚨 Indicadores de Urgencia**: Marca visual (🔴) para servicios urgentes
- **🖼️ Imágenes en Línea**: Carga de imágenes desde Internet usando la librería Coil
- **🎨 Diseño Material 3**: Interfaz moderna con Material Design 3
- **⬅️ Navegación Intuitiva**: Botones de retroceso en headers para fácil navegación

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Kotlin
- **UI Framework**: Jetpack Compose
- **Android SDK**: Mínimo API 24+
- **Material Design**: Material 3
- **Carga de Imágenes**: Coil (AsyncImage)
- **Build System**: Gradle (Kotlin DSL)

## 📦 Dependencias Principales

```kotlin
// Compose
androidx.compose.ui:ui
androidx.compose.material3:material3
androidx.compose.foundation:foundation

// Coil para carga de imágenes
io.coil-kt:coil-compose

// Material Icons
androidx.compose.material:material-icons-extended
```

## 🏗️ Estructura del Proyecto

```
VerviServicesListApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/verviserviceslistapp/
│   │   │   │   ├── MainActivity.kt           # Pantalla de inicio
│   │   │   │   ├── ServiceListActivity.kt    # Lista de servicios
│   │   │   │   ├── ServiceFormActivity.kt    # Formulario para crear servicios
│   │   │   │   ├── Service.kt                # Modelos de datos
│   │   │   │   └── ui/theme/                 # Configuración de tema
│   │   │   └── res/                          # Recursos
│   │   ├── test/                             # Tests unitarios
│   │   └── androidTest/                      # Tests de instrumentación
│   └── build.gradle.kts                      # Configuración de build
├── build.gradle.kts                          # Configuración global
├── settings.gradle.kts                       # Configuración de settings
└── README.md                                 # Este archivo
```

## 📊 Modelo de Datos

### Service
```kotlin
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
```

### ServiceType (Categorías)
- **HOGAR**: Servicios para el hogar
- **SALUD**: Servicios de salud
- **DISENO**: Diseño y decoración
- **GASTRONOMIA**: Servicios gastronómicos
- **JARDINERIA**: Servicios de jardinería
- **MUSICA**: Servicios musicales
- **TECNOLOGIA**: Servicios tecnológicos
- **EDUCACION**: Servicios educativos
- **ARTE**: Servicios artísticos

## 🚀 Primeros Pasos

### Requisitos
- Android Studio (versión actual)
- SDK Android mínimo 24
- Gradle 8.0+
- Kotlin 1.9+

### Instalación

1. **Clonar el repositorio**
```bash
git clone <url-del-repositorio>
cd VerviServicesListApp
```

2. **Sincronizar dependencias**
```bash
./gradlew build
```

3. **Ejecutar en emulador o dispositivo**
```bash
./gradlew installDebug
```

## 📱 Pantallas Principales

### 🏠 MainActivity
Pantalla de inicio con dos opciones principales:
- Botón para ver lista de servicios
- Botón para crear un nuevo servicio

### 📋 ServiceListActivity
- Muestra todos los servicios en una lista scrollable
- Cada item contiene:
  - Imagen del servicio (80x80 dp)
  - Título del servicio
  - Ubicación
  - Precio
  - Contador de aplicaciones
  - Indicador de urgencia (si aplica)
- Botón de retroceso en el header

### ➕ ServiceFormActivity
- Formulario para crear nuevos servicios con campos para:
  - Título del servicio
  - Ubicación
  - Precio
  - Categoría
  - URL de imagen
  - Opción de marcar como urgente
- Botón de retroceso en el header

## 🎨 Tema y Estilos

La aplicación utiliza Material Design 3 con:
- **Colores Primarios**: Azul/Morado (personalizable)
- **Tipografía**: Roboto (Material default)
- **Formas**: RoundedCornerShape para cards y elementos

## 💾 Gestión de Estado

La aplicación utiliza un patrón **Singleton** (`serviceSingleton`) para gestionar la lista de servicios en memoria. Cada vez que se crea un servicio, se añade a esta lista compartida.

## 📝 Notas de Desarrollo

- Las imágenes se cargan desde URLs de Internet usando Coil
- La aplicación es responsive y funciona en diferentes tamaños de pantalla
- La navegación se maneja mediante intents entre Activities
- Material Icons se utiliza para el icono de flecha atrás

## 🔄 Historial de Cambios

### v1.0.0 - Inicial
- ✅ Pantalla de inicio
- ✅ Lista de servicios con imágenes
- ✅ Formulario para crear servicios
- ✅ Navegación con botones de retroceso
- ✅ 9 categorías de servicios
- ✅ Carga de imágenes desde Internet

## 🐛 Reportar Problemas

Si encuentras algún bug o tienes sugerencias, por favor abre un issue o contacta al equipo de desarrollo.

## 📄 Licencia

Este proyecto está bajo la licencia MIT.

## 👤 Autor

Desarrollado como parte del proyecto VerviServicesListApp.

---

**Última actualización**: Abril 2026

