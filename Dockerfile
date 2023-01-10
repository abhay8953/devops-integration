From openjdk:11
Expose 8082
Add target/devopsintegration.jar devopsintegration.jar
Entrypoint ["java","-jar","/devopsintegration.jar"]
