From openjdk:11-jdk-alpine
Expose 8082
Add target/devops-integration.jar devops-integration.jar
Entrypoint ["java","-jar","/devops-integration.jar"]