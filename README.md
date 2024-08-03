# Java Microservices

This project demonstrates how to write microservices using Java and Spring Boot.

## Table of Contents

1. [Tech Stack](#tech-stack)
2. [How to Run](#how-to-run)

## Tech Stack

- **Java**: High-level programming language for building enterprise applications.
- **Spring Boot**: Framework for easy setup and development of Spring applications.
- **Spring JPA**: Simplifies database interactions using object-relational mapping.
- **Maven**: Build tool for managing project dependencies and build processes.
- **Kafka**: Distributed streaming system for building real-time data pipelines and applications.
- **Docker**: Platform for automating application deployment in portable containers.
- **Kubernetes**: Orchestrates containerized applications for deployment and management.
- **Helm**: Manages Kubernetes applications with Helm charts for easy installation and upgrades.

## How to Run

1. **Install Maven Build Tool**

    ```bash
    brew install maven
    ```

2. **Start the Account Service**

    ```bash
    cd accounts
    mvn spring-boot:run
    ```

3. **Access the H2 Console**

   Open your browser and navigate to:

    ```url
    http://localhost:8080/h2-console
    ```

4. **Access the Swagger UI**

   Open your browser and navigate to:

    ```url
    http://localhost:8080/swagger-ui/index.html
    ```
