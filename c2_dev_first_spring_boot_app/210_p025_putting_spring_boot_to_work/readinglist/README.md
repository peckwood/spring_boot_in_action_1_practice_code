## How to start

After started application, visit http://localhost:8080/readingList/

## An empty project created with Spring Initializer

## Dependencies

Web, Thymeleaf, and JPA

## What I learnt

### Functions of @SpringBootApplication(p27)

1. `@Configuration`: designates a class as a configuration class
2. `@ComponentScan`: enables scanning of components so they can be wired automatically
3. `@EnableAutoConfiguration`: enables Spring Boot's auto configuration

But before Spring Boot 1.2.0, you have to annotate all 3 of them.

### How to run Spring Boot with  Gradle(p28)

1. `gradle bootRun` inside application root directory

2. ```
   gradle build
   java -jar build/libs/readingList.jar
   ```

### How to configure server port with application.properties(p29)

```
server.port=8000
```

### How to build a Spring Boot application with barely any configuration

Using Thymeleaf, JPA

### How conditional configuration helps automatic configuration(p45)

1. How to create a Condition(p45)
2. Conditional annotations used in auto-configuration (p46)
3. How Spring uses conditional annotation in auto-configuration

### How configuration decisions are made by the conditionals in auto-configuration(p48)

1. MySql in classpath > Datasource bean created > JPA created > JPA configured to automatically create repository implementation from repository interface
2. Thymeleaf in classpath > Template resolver will be ocnfigured
3. Spring MVC on classpath > DispatcherServlet is configured, Spring MVC enabled > static resources will be handled

## Issues

Cannot access style.css, 404, sometimes