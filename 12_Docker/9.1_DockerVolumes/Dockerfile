FROM openjdk:24-slim-bullseye
COPY target/student-app.jar /student-app.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "/student-app.jar"]