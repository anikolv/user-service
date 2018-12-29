Running the application from source code (requires JVM/JRE): 
-------------

mvnw spring-boot:run

OR

mvnw clean package

java -jar target/user-service-1.0.0.jar

Endpoints:
-------------

POST http://localhost:9090/user-service/api/user/create
```json
{
        "firstName": "Ivan",
        "lastName": "Ivanov",
        "email": "ivan@gmail.com"
}
```

GET http://localhost:9090/user-service/api/user/get?id=1

GET http://localhost:9090/user-service/api/user/getAll
