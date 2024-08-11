# Java Microservices

This project demonstrates how to write microservices using Java and Spring Boot.

## Table of Contents

1. [Tech Stack](#tech-stack)
2. [How to Run](#how-to-run)
3. [Docker Commands](#docker-commands)

## Tech Stack

- **Java**: High-level programming language for building enterprise applications.
- **Spring Boot**: Framework for easy setup and development of Spring applications.
- **Spring REST Docs**: Facilitates the generation of documentation for RESTful services.
- **Spring Cloud Config**: Supports externalized configuration for distributed systems.
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

## Docker Commands

| Docker Command                                                                                                            |     Description          |
|---------------------------------------------------------------------------------------------------------------------------| ------------- |
| "docker build . -t maxlivinci/accounts"                                                                                  | To generate a docker image based on a Dockerfile |
| "docker run  -p 8080:8080 maxlivinci/accounts"                                                                           | To start a docker container based on a given image |
| "docker images"                                                                                                           | To list all the docker images present in the Docker server |
| "docker image inspect image-id"                                                                                           | To display detailed image information for a given image id |
| "docker image rm image-id"                                                                                                | To remove one or more images for a given image ids |
| "docker image push docker.io/maxlivinci/accounts"                                                                        | To push an image or a repository to a registry |
| "docker image pull docker.io/maxlivinci/accounts"                                                                        | To pull an image or a repository from a registry |
| "docker ps"                                                                                                               | To show all running containers |
| "docker ps -a"                                                                                                            | To show all containers including running and stopped |
| "docker container start container-id"                                                                                     | To start one or more stopped containers |
| "docker container pause container-id"                                                                                     | To pause all processes within one or more containers |
| "docker container unpause container-id"                                                                                   | To unpause all processes within one or more containers |
| "docker container stop container-id"                                                                                      | To stop one or more running containers |
| "docker container kill container-id"                                                                                      | To kill one or more running containers instantly |
| "docker container restart container-id"                                                                                   | To restart one or more containers |
| "docker container inspect container-id"                                                                                   | To inspect all the details for a given container id |
| "docker container logs container-id"                                                                                      | To fetch the logs of a given container id |
| "docker container logs -f container-id"                                                                                   | To follow log output of a given container id |
| "docker container rm container-id"                                                                                        | To remove one or more containers based on container ids |
| "docker container prune"                                                                                                  | To remove all stopped containers |
| "docker compose up"                                                                                                       | To create and start containers based on given docker compose file |
| "docker compose down"                                                                                                     | To stop and remove containers |
| "docker compose start"                                                                                                    | To start containers based on given docker compose file |
| "docker compose down"                                                                                                     | To stop the running containers |
| "docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql"             | To create a MySQL DB container |
| "docker run -p 6379:6379 --name eazyredis -d redis"                                                                       | To create a Redis Container |
| "docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev" | To create Keycloak Container|