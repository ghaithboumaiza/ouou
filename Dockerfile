FROM eclipse-temurin:18-jdk-alpine
WORKDIR /app
COPY target/Spring_Boot_Message-0.0.1-SNAPSHOT.jar Spring_Boot_Message-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","Spring_Boot_Message-0.0.1-SNAPSHOT.jar"]