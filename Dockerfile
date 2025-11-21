# Dockerfile for Java application
# Build the application locally with: mvn clean package
# Then build the Docker image with: docker build -t my-app:1.0 .

FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the pre-built JAR file from the target directory
COPY target/my-app-1.0-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-cp", "app.jar", "es.ull.app.App"]
