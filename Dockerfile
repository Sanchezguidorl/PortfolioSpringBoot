
FROM amazoncorretto:17-alpine-jdk
MAINTAINER GuidoSanz
COPY target/Guido-Sanchez-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["java","-jar","/portfolio-app.jar"]