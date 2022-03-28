FROM openjdk:17-oracle
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar docker-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-app.jar"]