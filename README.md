# My App - Hello World Java Application

Este es un proyecto Java Maven que demuestra una aplicación básica "Hello World".

## Requisitos

- Java 17
- Maven 3.x
- Docker (para ejecución en contenedor)

## Construcción del Proyecto

Para construir el proyecto con Maven:

```bash
mvn clean package
```

## Ejecución Local

Para ejecutar la aplicación localmente:

```bash
java -cp target/my-app-1.0-SNAPSHOT.jar es.ull.app.App
```

## Despliegue en Docker

### Construir la Imagen Docker

Primero, construye el proyecto con Maven y luego crea la imagen Docker:

```bash
mvn clean package
docker build -t my-app:1.0 .
```

### Ejecutar el Contenedor

Para ejecutar la aplicación en un contenedor Docker:

```bash
docker run --rm my-app:1.0
```

### Usando Docker Compose

Alternativamente, puedes usar Docker Compose para construir y ejecutar la aplicación:

```bash
# Construir el proyecto con Maven
mvn clean package

# Construir y ejecutar con Docker Compose
docker compose up
```

Para reconstruir la imagen:

```bash
docker compose up --build
```

## Tests

Para ejecutar los tests del proyecto:

```bash
mvn test
```
