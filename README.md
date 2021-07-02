
Spring Boot Zuul  and Eureka 
------------------------------

Running Attached Project :

1.	Extract and you can find four maven projects 
2.	Run all the project with mvn clean install –Dmaven.test.skip=true spring-boot:run

Access the two micro service through the api gateway zuul-server (http://localhost:9090) : 

http://localhost:9090/api/account-by-service/account/login

http://localhost:9090/api/node-by-service/node/1

Service Discovery through the URL :
http://localhost:8761/
