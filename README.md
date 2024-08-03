# Java Microservices

This project demonstrates how to write microservices using Java and Spring Boot.

## How to Run

1. **Install Maven Build Tool**

    ```bash
    brew install maven
    ```

2. **Go to the account service and start the server**

    ```bash
    cd accounts
    mvn spring-boot:run
    ```

3. **Access the H2 console**

   Open your browser and navigate to:

    ```bash
    http://localhost:8080/h2-console
    ```

4. **Access the Swagger UI**

   Open your browser and navigate to:

    ```bash
    http://localhost:8080/swagger-ui/index.html
    ```