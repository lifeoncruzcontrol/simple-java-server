# simple-java-server

This is a simple backend with a Java API written with Spring Boot, and a Postgres database

## Goals:
- Get familiar with Java and best practices
- Get familiar with Spring Boot
- Do a simple integration with Java and Postgres

## To run
- Run with `gradle bootRun`
OR
- Build an executable jar with `gradle bootJar`
- Run the executable with `java -jar build/libs/<your file>.jar`
OR with Docker
- Run `./gradlew build` to create a jar file
- Run `docker compose up --build`. This uses our jar file