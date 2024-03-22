# Spring Boot Blog API
## Description
This project is a Blog REST API developed with Spring Boot. This project includes the following features:

- Spring Boot 3.0.4
- Spring Security 6 with JWT authentication and authorization
- Swagger UI for API documentation and testing (http://localhost:8080/swagger-ui/index.html) with authentication and authorization support
- Spring Data JPA with MySQL database integration
- REST API’s for Pagination and Sorting
- Exception handling mechanism with custom exceptions and exception handlers using @ControllerAdvice
- Lombok for reducing boilerplate code
- ModelMapper for mapping DTOs to entities and entities to DTOs 
- Deploy on AWS

## Tools and Technologies used in this project:
Technologies:
- Java 8+
- Spring Boot 3
- Spring MVC
- Spring Data JPA ( Hibernate)
- Spring Security 6 
- JWT
- Lombok
- ModelMapper
- AWS

Database:
- MySQL database

Tools:
- Swagger - API documentation
- Postman - Test REST API
- Maven - Build Tool

## How to run
1. Clone this repository
2. Create a MySQL database
3. Change the database configuration in application.properties
4. Run the application with mvn spring-boot:run
5. Open http://localhost:8080/swagger-ui/index.html in your browser
6. Sign Up/Register a new user
7. Sign In/Login with the registered user
8. Copy the JWT token from the response
9. Click the Authorize button in the Swagger UI
10. Paste the JWT token in the Value field without the Bearer prefix
11. Click the Authorize button
Now you can test the API endpoints

## How to run the application using Docker:
1- Uncomment the line "spring.profiles.active=docker" in the "application.properties" file.
2- Run ``` mvn clean package -DskipTests ``` to build the applications and create the docker image locally.
3- Run ``` docker-compose up -d --build ``` to start the applications.

![image](https://github.com/haktanonur/spring-boot-blog-api/assets/69698425/2474a8df-736a-4cea-955c-2a36ef6300d9)
