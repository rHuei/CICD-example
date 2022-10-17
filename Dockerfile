FROM hb.k8sbridge.com/demo/maven:base AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:13-jdk-alpine3.10
COPY --from=build /app/target/demo.war /usr/local/lib/demo.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.war"]
