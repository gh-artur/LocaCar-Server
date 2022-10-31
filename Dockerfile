FROM openjdk:17
LABEL maintainer="ArturS"
ADD target/LocaCar-0.0.1-SNAPSHOT.jar locacar-server.jar
ENTRYPOINT ["java", "-jar", "locacar-server.jar"]
