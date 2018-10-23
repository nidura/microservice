FROM java:8
EXPOSE 8087
ADD /target/client-service.jar client-service.jar
ENTRYPOINT [“java”, “-jar”, “client-service.jar”]
