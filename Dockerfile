FROM openjdk:17-jdk-alpine
EXPOSE 8088
ARG JAR_FILE=formRDS/target/formRDS-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD [ "java", "-jar",  "/formRDS-0.0.1-SNAPSHOT.jar"]

