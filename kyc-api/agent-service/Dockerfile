FROM java:8
EXPOSE 8085
ADD /target/agent-service.jar agent-service.jar
ENTRYPOINT [“java”, “-jar”, “agent-service.jar”]
