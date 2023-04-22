FROM amazoncorretto:17-alpine-jdk
MAINTAINER DeboraAbrilBadosa
COPY target/dab-0.0.1-SNAPSHOT dab-app.jar
ENTRYPOINT ["java","-jar","/dab-app.jar"]
