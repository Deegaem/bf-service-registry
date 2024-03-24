FROM eclipse-temurin:19.0.2_7-jdk-alpine
ARG JAR_FILE=/build/libs/bf-service-registry-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app.jar"]