FROM amazoncorretto:18-alpine-jdk
MAINTAINER DeboraAbrilBadosa
COPY target/dab-0.0.1-SNAPSHOT.jar dab-app.jar
ENTRYPOINT ["java","-jar","/dab-app.jar"]
