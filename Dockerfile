FROM openjdk:11.0.10-oraclelinux7
ARG JAR_FILE=target/liquibase-h2*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
