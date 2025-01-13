# Spring Boot + Spring data JPA + PostgreSQL Infra Example

Based on examples provided by [mkyong](https://github.com/mkyong/spring-boot)

## Technologies used:
Technologies used:
* Spring Boot 3.4.1
* Spring Data JPA (Hibernate 6  is the default JPA implementation)
* PostgreSQL 15
* Maven
* Java 23
* JUnit 5
* Docker
* [REST Assured](https://rest-assured.io/) and [Testcontainers](https://testcontainers.com/) (for Spring integration tests using a container)

## Setup
```
git clone [https://github.com/pc-dae/infra.git](https://github.com/pc-dae.infra.git)
cd infra
```
## Build
```
./mvnw spring-boot:build-image
```
## Deploy
```
tag=0.0.1 # Increment this on each deployment
docker tag infra-mgr:1.0 paulcarltondae/infra:$tag
docker push  paulcarltondae/infra:$tag
```