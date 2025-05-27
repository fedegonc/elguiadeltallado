# El Guía del Tallado - Sitio Web

## Descripción
Sitio web oficial El Guía del Tallado, una empresa dedicada a la artesanía en madera. El sitio está desarrollado con Spring Boot y cuenta con tecnologías modernas para ofrecer una experiencia de usuario fluida y responsiva.

## Tecnologías Utilizadas
- **Java**: Lenguaje principal de programación
- **Spring Boot**: Framework principal para el desarrollo del backend
- **Thymeleaf**: Motor de plantillas para renderizar vistas HTML
- **JavaScript**: Para cargas dinámicas de contenido sin recargar la página completa
- **CSS**: Estilos personalizados para la interfaz de usuario

## Estructura del Proyecto
```
talladosdelcampo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── elguiadeltallado/
│   │   │           ├── controller/
│   │   │           │   └── HomeController.java controlador principal para /inicio
│   │   │           └── ElGuiadoDelTalladoApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── styles.css
│   │       ├── templates/
│   │       │   ├── fragments/
│   │       │   │   │footer.html
│   │       │   │   └navbar.html
│   │       │   ├── layout/
│   │       │   ├── inicio.html
│   │       └── application.properties
└── pom.xml
```

## Páginas Implementadas
1. **Inicio**: Página principal del sitio


## Características Técnicas
- **Arquitectura MVC**: Implementado con Spring MVC
- **Fragmentación de Plantillas**: Uso de fragmentos Thymeleaf para reutilización de código
- **Diseño Responsivo**: Interfaz adaptable a diferentes dispositivos

## Cómo Ejecutar el Proyecto
1. Asegúrate de tener Java 11 o superior instalado
2. Clona este repositorio
3. Navega a la carpeta del proyecto
4. Ejecuta: `./mvnw spring-boot:run` (en Windows: `mvnw.cmd spring-boot:run`)
5. Accede a la aplicación en [http://localhost:8080](http://localhost:8080)
