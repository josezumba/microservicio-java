FROM openjdk:11-jre

EXPOSE 8085

ADD build/libs/testing-web-0.0.1-SNAPSHOT-plain.jar  /app/testing-web-0.0.1-SNAPSHOT-plain.jar

WORKDIR /app

CMD java -jar spring-microservicio-java-2.6.3.jar
