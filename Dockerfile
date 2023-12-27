FROM openjdk:11-jre

EXPOSE 8085

ADD testing-web-0.0.1-SNAPSHOT.jar  /app/microservicio-java-0.0.1-SNAPSHOT.jar

WORKDIR /app

CMD java -jar microservicio-java-0.0.1-SNAPSHOT.jar
