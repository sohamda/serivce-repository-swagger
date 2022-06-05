# Swagger 3.0 Spec : Contract-First microservices by Spring Boot

A simple application to show how using Swagger 3.0 specfications, we can generate required classes for Spring Boot microservice. 
And also implement them using Controller-Service-Repository pattern.

You can also found, the use of Mapstruct usages to convert/copy objects.

Basic application is based on : https://github.com/sohamda/liquibase-h2

Implementation :
1. Swagger 3.0 Open API Specs : https://swagger.io/specification/
2. Maven plugin for code generation : https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin
3. Mapstruct : https://mapstruct.org/documentation/stable/reference/html/
4. Service-Repo pattern:
   a. https://springbootdev.com/2017/07/31/spring-framework-component-service-repository-and-controller/
   b. https://docs.spring.io/spring-roo/reference/html/base-layers.html

## To run this :
`` mvn clean install ``

`` mvn spring-boot:run``

## Detail - How to

Follow the step-by-step guide in this blog : https://medium.com/springboot-chronicles/api-first-approach-with-openapi-contracts-maven-spring-boot-6aa9b9251341
