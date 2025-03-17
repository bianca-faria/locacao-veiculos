# Usa uma imagem do OpenJDK como base
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o JAR gerado pela aplicação para o contêiner
COPY target/vehicle-allocation-system.jar app.jar

# Expõe a porta que a aplicação usará
EXPOSE 8082

# Comando para rodar a aplicação dentro do contêiner
CMD ["java", "-jar", "app.jar"]