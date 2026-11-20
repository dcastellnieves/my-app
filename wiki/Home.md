# Wiki del proyecto

## Resumen

`my-app` es una aplicación de ejemplo en Java que imprime `Hello World!`. El
proyecto usa Maven, pruebas con JUnit 5 y ofrece una imagen Docker para ejecutar
la aplicación.

## Estado actual

**Estado: prototipo funcional, de alcance muy básico.** La aplicación y sus
pruebas están implementadas; no se observan funcionalidades de negocio,
interfaces de usuario ni servicios externos.

Esta página se actualizó el **20 de noviembre de 2026**. Según la actividad
consultada en GitHub:

- La rama predeterminada es `master`; el último commit publicado es
  `86b211f` (13 de diciembre de 2025).
- Las últimas ejecuciones visibles de CI y SonarCloud para ese commit
  finalizaron correctamente el 15 de diciembre de 2025.
- No hay issues ni pull requests abiertos.
- No hay ejecuciones posteriores visibles en los datos consultados; por eso,
  el resultado de CI no confirma el estado del proyecto en noviembre de 2026.

### Observación sobre CI

Los workflows de GitHub Actions declaran eventos `push` para las ramas `main`
y `develop`, mientras que la rama predeterminada es `master`. También aceptan
pull requests y ejecución manual. Conviene alinear las ramas de los workflows
con la estrategia de ramas real para que los pushes a `master` activen CI como
se espera.

## Tecnologías y requisitos

- Java 17 (el workflow de CI también prueba con Java 21 y 23).
- Maven 3.x.
- Docker, opcional, para ejecutar en contenedor.
- Maven gestiona JUnit 5 y JaCoCo para pruebas y cobertura.
- GitHub Actions ejecuta CI y análisis de SonarCloud.

## Estructura

```text
src/main/java/es/ull/app/App.java       Punto de entrada; imprime el saludo
src/test/java/es/ull/app/AppTest.java   Pruebas unitarias con JUnit 5
.github/workflows/                      CI y análisis de calidad
Dockerfile                              Imagen de ejecución Java 17
docker-compose.yml                      Ejecución mediante Docker Compose
pom.xml                                 Configuración Maven y dependencias
```

## Construir, probar y ejecutar

Desde la raíz del repositorio:

```bash
mvn clean package
mvn test
java -cp target/my-app-1.0-SNAPSHOT.jar es.ull.app.App
```

La salida esperada de la aplicación es:

```text
Hello World!
```

Para ejecutar con Docker:

```bash
mvn clean package
docker build -t my-app:1.0 .
docker run --rm my-app:1.0
```

Como alternativa, con Docker Compose:

```bash
mvn clean package
docker compose up --build
```

## Enlaces

- [Código fuente](https://github.com/dcastellnieves/my-app)
- [Ejecuciones de GitHub Actions](https://github.com/dcastellnieves/my-app/actions)
- [README y guía rápida](../README.md)
