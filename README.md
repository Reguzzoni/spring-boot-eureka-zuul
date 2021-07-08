
**Spring Boot Swagger Zuul and Eureka 
------------------------------

**Documentazione nice to read**

**EUREKA
https://www.baeldung.com/spring-cloud-netflix-eureka

**GATEWAY AND LOAD BALANCING WITH ZUUL
https://www.baeldung.com/zuul-load-balancing

**GIT DOCUMENTATION
https://git-scm.com/doc

**WHAT IS SWAGGER
https://swagger.io/docs/specification/2-0/what-is-swagger/


**Running Attached Project :

Set environment with eclipse
1. download Git
2. Follow guide https://git-scm.com/book/it/v2/Git-Basics-Getting-a-Git-Repository to local folder
3. Import projects into eclipse (eclipse oxigen is better if u can)
4. Follow lombok guide https://projectlombok.org/download and restart eclipse
5. Update all maven projects to import all dependencies

You need postgresql file patch starter

**EUREKA SERVER 
Start eureka server mono node
1. Run spring boot application without profile

Test Eureka mono node
1. Check URL http://127.0.0.1:8761 after start

OR

Start eureka server cluster
1. Run spring boot project EurekaServer application with profile "peer1"
2. Run spring boot project EurekaServer application with profile "peer2"
3. Run spring boot project EurekaServer application with profile "peer3"

Test Eureka cluster
1. Check URL http://127.0.0.2:8762 after start peer1
2. Check URL http://127.0.0.3:8763 after start peer2
3. Check URL http://127.0.0.4:8764 after start peer3


**ZUUL
Start Zuul 
1. Run spring boot project ZuulServer application with profile "peer1"

Test start Zuul
1. Access through the api gateway zuul-server (http://localhost:9090) 


**START SERVICES EUREKA CLIENT
1. Run spring boot project TestService application which will expose test/helloworld service
2. Test it with get http request http://localhost:9090/api/test-service/test/helloWorld
3. Run spring boot project AnagraficaService application which will expose ruoli/getRuoli service
4. Test it with get http request http://localhost:9090/api/anagrafica-service/ruoli/getListRuoli


**SWAGGER
1. Check by swagger http://localhost:9090/api/anagrafica-service/swagger-ui.html#!/

