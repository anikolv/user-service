Running the application from source code (requires JVM/JRE): 
-------------

mvnw spring-boot:run

OR

mvnw clean package

java -jar target/user-service-1.0.0.jar

Endpoints:
-------------

POST http://localhost:8080/user-service/api/user/create
```json
{
        "username": "username",
        "password": "password",
        "firstName": "Ivan",
        "lastName": "Ivanov",
        "phoneNumber": "123456",
        "email": "ivan@gmail.com"
	
}
```

GET http://localhost:8080/user-service/api/user/get?id=1

GET http://localhost:8080/user-service/api/user/getAll
