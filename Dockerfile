FROM maven:3.9.9-eclipse-temurin-17 AS build

COPY src /app/src
COPY pom.xml /app


WORKDIR /app
RUN mvn clean install

Execução da aplicação
FROM eclipse-temurin:17-jdk AS runtime


WORKDIR /app


COPY --from=build /app/target/*.jar vehicle-allocation-system.jar


EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "vehicle-allocation-system.jar"]
