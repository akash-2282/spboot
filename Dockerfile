# Use a base image with Java and Maven installed
FROM maven:3.8.4-openjdk-11-slim AS build
# Set the working directory
WORKDIR /app
# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src
# Build the application
RUN mvn clean install -DskipTests
# Create a new image with a JRE and the built JAR
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/your-app.jar app.jar
# Run the application
CMD ["java", "-jar", "app.jar"]
