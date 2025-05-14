# Java Microservice Data API

Este es un microservicio REST desarrollado con **Spring Boot**, que expone una API para consultar un catálogo de productos. Es parte de mi portafolio de backend y arquitectura de microservicios.

## 🔧 Tecnologías utilizadas

- Java 17  
- Spring Boot 3.3.11  
- Spring Web  
- Spring Data JPA  
- H2 (base de datos en memoria)  
- Maven  

## 📦 Estructura del proyecto
src/
└── main/
├── java/
│ └── com/
│ └── example/
│ └── java_microservice_data_api/
│ ├── controller/ # Controladores REST
│ ├── model/ # Clases modelo (Product)
│ └── JavaMicroserviceDataApiApplication.java
└── resources/
└── application.properties

## 🚀 Ejecución local

1. Clona el repositorio:
   git clone https://github.com/dmonarchc/java-microservice-data-api.git
   cd java-microservice-data-api

2. Ejecuta el microservicio:
   mvn spring-boot:run

3. Abre en el navegador:
   http://localhost:8080/products

## 📌 Endpoints disponibles

| Método | Endpoint    | Descripción                  |
|--------|-------------|------------------------------|
| GET    | /products   | Lista de productos simulados |

## 🧠 Propósito

Este proyecto fue creado como ejercicio práctico para consolidar habilidades en:
- Creación de microservicios con Java
- Diseño de APIs RESTful
- Control de versiones con Git y GitHub
- Buenas prácticas de documentación y estructura de proyecto

## ✍️ Autor

Desarrollado por **[dmonarchc]**  
[GitHub](https://github.com/dmonarchc)

## 📜 Licencia

Este proyecto se publica bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente.