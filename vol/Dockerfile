FROM  java:8
EXPOSE 8083
ADD /target/vol-0.0.1-SNAPSHOT.jar vol-service.jar
ENTRYPOINT ["java", "-jar", "vol-service.jar"]