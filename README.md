Running the application from source code: 
-------------

spring-boot:run

Building and running executable JAR:
-------------

mvn clean package

java -jar target/user-service-1.0.0.jar

Endpoints:
-------------

POST http://localhost:8080/user-service/api/user/create

{
        "username": "username",
        "password": "password",
        "firstName": "Ivan",
        "lastName": "Ivanov",
        "phoneNumber": "123456",
        "email": "ivan@gmail.com"
	
}

GET http://localhost:8080/user-service/api/user/get?id=1

GET http://localhost:8080/user-service/api/user/getAll