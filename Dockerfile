FROM  openjdk:17
VOLUME /tmp

EXPOSE 8080
ADD ./target/file.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]