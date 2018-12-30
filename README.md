Running the application from source code (requires JVM/JRE): 
-------------

mvnw spring-boot:run

OR

mvnw clean package

java -jar target/user-service-1.0.0.jar

Endpoints:
-------------

POST https://ec2-34-209-175-216.us-west-2.compute.amazonaws.com:8080/user-service/api/user/create
```json
{
        "name": "Alexander Nikolov",
        "token": "1243521325"
}
```
GET https://ec2-34-209-175-216.us-west-2.compute.amazonaws.com:8080/user-service/api/user/get?id=1

GET https://ec2-34-209-175-216.us-west-2.compute.amazonaws.com:8080/user-service/api/user/getAll
