FROM eclipse-temurin:17-alpine
ARG JAR_FILE=target/service-repository-swagger*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
