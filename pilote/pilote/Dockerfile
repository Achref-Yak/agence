FROM  java:8
EXPOSE 8084
ADD /target/pilote-0.0.1-SNAPSHOT.jar pilote-service.jar
ENTRYPOINT ["java", "-jar", "pilote-service.jar"]