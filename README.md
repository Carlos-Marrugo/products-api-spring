![Amarillo y Naranja Simple Limpio Digital Adivina la Imagen con Zoom Juego Presentación Divertida](https://github.com/user-attachments/assets/bb6d1c21-4c9c-4835-8cac-145286877138)

# 🚀 FILTRA DATOS SIN ESCRIBIR SQL 😱 | SPRING BOOT API REST

## 📌 Descripción del Proyecto

Este proyecto consiste en la creación de una **API REST** con **Spring Boot** que permite gestionar productos y filtrarlos por precio o nombre **sin necesidad de escribir consultas SQL**. Utilizamos los **Query Methods** de **Spring Data JPA** para lograrlo de manera rápida y sencilla.

## 🎯 Objetivos del Proyecto

- Guardar productos con **nombre** y **precio**.
- Filtrar productos con un precio menor a un valor específico.
- Buscar productos por coincidencia en el **nombre**.
- Implementar consultas personalizadas usando **Query Methods**.

## 🛠️ Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 3.x.x**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (Base de datos en memoria para pruebas)
- **Postman** (para probar los endpoints)


## 🔥 Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/api-filtrar-productos.git
   
2. **Abrir el proyecto en tu IDE favorito.**
3. **Ejecutar la aplicación:**
   Desde tu IDE: Corre la clase ProductoAppApplication.

🌐 Endpoints de la API
1️⃣ Crear un Producto
URL: POST /api/productos/crear
Body:
```json

{
    "nombre": "Laptop",
    "precio": 1500.00
}
```

Respuesta:
```json
{
    "id": 1,
    "nombre": "Laptop",
    "precio": 1500.0
}
```

2️⃣ Filtrar Productos por Precio
URL: GET /api/productos/menor-precio/{precio}
Ejemplo: GET /api/productos/menor-precio/1000
Respuesta:
```json
[
    {
        "id": 2,
        "nombre": "Mouse",
        "precio": 25.0
    }
]
```

3️⃣ Buscar Productos por Nombre
URL: GET /api/productos/buscar?nombre={nombre}
Ejemplo: GET /api/productos/buscar?nombre=Lap
Respuesta:
```json
[
    {
        "id": 1,
        "nombre": "Laptop",
        "precio": 1500.0
    }
]
```

✨ ¿Qué Aprenderás?
Cómo crear Query Methods personalizados con Spring Data JPA.
Implementar endpoints REST de forma sencilla.
Probar tu API con Postman.
