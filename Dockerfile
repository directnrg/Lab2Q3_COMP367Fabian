FROM openjdk:17
EXPOSE 9090
ADD target/Lab3Q1-devops.jar Lab3Q1-devops.jar
ENTRYPOINT ["java","-jar", "/Lab3Q1-devops.jar"]