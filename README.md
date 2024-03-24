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
- Docker for containerization

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
- Docker

Database:
- MySQL database

Tools:
- Swagger - API documentation
- Postman - Test REST API
- Maven - Build Tool
- Docker

## How to run
1- Clone this repository ```https://github.com/haktanonur/SpringBootBlogAPI.git```

2- Run ``` mvn clean package -DskipTests ``` to build the applications and create the docker image locally.

3- Run ``` docker-compose up --build ``` to start the applications.

4- Open http://localhost:8080/swagger-ui/index.html in your browser

5- Sign Up/Register a new user

6- Sign In/Login with the registered user

7- Copy the JWT token from the response 

8- Click the Authorize button in the Swagger UI

9- Paste the JWT token in the Value field without the Bearer prefix 

10- Click the Authorize button

Now you can test the endpoints !

![image](https://github.com/haktanonur/spring-boot-blog-api/assets/69698425/2474a8df-736a-4cea-955c-2a36ef6300d9)
