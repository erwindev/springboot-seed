## Springboot Starter Project  
This project is meant to be used as a starter spring boot project.  If you need run it, you can run it against a Postgres database or you can run it against the H2 database.

There are several ways to run the application.  

You can choose to generate a jar file.  In which case, you will need to run
```
gradle assemble
```
The command will generate **nameofproject-0.1.0.jar** under
```
projectlocation/build/libs
```
You will then need to run the jar using the following command
```
java -jar nameofproject-0.1.0.jar
```

Or execute from the command line
```
gradle run
```

Or thru the IDE.  In this case, you will need to run the **Application.groovy** script.


## What's in this project
### Controller Object (MainController)
This is a sample REST Controller.  It contains sample methods that can take POST and GET data.

### Domain Objects (Student and Classroom)
These are plain old groovy objects (POGO).  It contains JPA annotations so that it can be properly saved in your database of choice.  

### Data Access Objects (StudentDao and ClassroomDao)
These are objects that handle the persistence using the Java Persistence API (JPA).  It creates a lot of abstraction to the most CRUD operations.  Typically, you will only need to add interface methods to **findByXXX** methods.

### Service Objects (Classroom Service)
The service objects typically contain your business logic.  

### Test (MainControllerSpec)
This is a spock test.  

## Database
To use Postgres, you will need to use the following dependency:

```
compile("postgresql:postgresql:9.1-901.jdbc4")
```


If you decide to use Postgres, you will need to setup the datasource settings in your application.properties file.  For example:


```
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://ipadress:port/dbname
spring.datasource.username=username
spring.datasource.password=password
```

To use the embedded H2 database, you will need to use the following dependency:

```
compile("com.h2database:h2:1.0.60")
```

**Please note: You can only use one.**

## Connection Pool
By default, Spring uses DBCP for its connection pooling.  HikariCP is preferred.  To do this, tomcat-jdbc need to be excluded from the spring-boot-starter-jdbc

```
compile("org.springframework.boot:spring-boot-starter-jdbc"){
	exclude module: 'tomcat-jdbc'
}
```


## Webserver

The application has an embedded web server.  Spring Boot will come with Tomcat as the default web server.  For this application, I have chosen Jetty.  

```
compile("org.springframework.boot:spring-boot-starter-web"){
   exclude module: 'spring-boot-starter-tomcat'
}
//use jetty
compile("org.springframework.boot:spring-boot-starter-jetty")
```



## Testing

In order to run the spock test.  You will need start Spring Boot application before you can start to test.  Once you have it started, you can run
```
gradle test

## API Documentation
API Documentation is rendered using Swagger.

```
