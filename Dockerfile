FROM openjdk:17-alpine

ENV APP_HOME=/Users/joseong-gyu/Desktop/spring/springdockerbuild

ARG JAR_FILE_PATH=build/libs/dockerbuild-0.0.1-SNAPSHOT.jar

WORKDIR $APP_HOME

COPY $JAR_FILE_PATH dockerbuild-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","dockerbuild-0.0.1-SNAPSHOT.jar"]
