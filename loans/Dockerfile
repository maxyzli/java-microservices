# Start with a base image containing Maven and Java
FROM maven:3.8.5-openjdk-17-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and other required files to the container
COPY pom.xml .

# Download the dependencies (this will be cached unless pom.xml changes)
RUN mvn dependency:go-offline -B

# Copy the rest of the application source code
COPY src ./src

# Package the application
RUN mvn clean install -DskipTests

# Use a minimal JDK image for running the application
FROM openjdk:17-jdk-slim

# Copy the packaged jar from the build stage
COPY --from=build /app/target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "loans-0.0.1-SNAPSHOT.jar"]