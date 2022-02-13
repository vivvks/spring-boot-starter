FROM openjdk:8
ADD target/spring-boot-starter.jar spring-boot-starter.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","spring-boot-starter.jar"]