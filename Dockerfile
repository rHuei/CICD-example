FROM hb.k8sbridge.com/demo/maven:base AS build
ARG APP_VERSION=v0.1
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package -Dapp.version=$APP_VERSION

FROM openjdk:13-jdk-alpine3.10
COPY --from=build /app/target/demo.war /usr/local/lib/demo.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.war"]
