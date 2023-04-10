FROM openjdk:17-jdk-slim

WORKDIR /

COPY target/server-0.0.1-SNAPSHOT.jar clover-coffee.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "clover-coffee.jar"]