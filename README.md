# TODO-List-Spring-Boot-App
Simple TODO Application using REST API built with Spring Boot

# Features
1. Present: \
    HTTP methods - GET, POST, PUT, DELETE

2. Future: \
    Tests - unit and integration *in progress \
    Template - Thymeleaf \
    Login and registration - Spring Security \


# Configure application.properties file 
spring.datasource.url=jdbc:h2:mem:TODO \
spring.datasource.driverClassName=org.h2.Driver \
spring.datasource.username=sa \
spring.datasource.password= \
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect \
#enabling the H2 console \
spring.h2.console.enabled=true \
server.error.include-message=always \