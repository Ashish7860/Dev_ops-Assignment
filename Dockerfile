FROM openjdk:17-alpine
EXPOSE 8081
ADD target/*.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]