FROM openjdk:17-alpine
EXPOSE 8085
ADD target/*.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]