FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-starter-web.jar
ENTRYPOINT ["java","-jar","/springboot-starter-web.jar"]
