FROM java:8
ADD target/*.jar docker-sample.jar
RUN sh -c 'touch /docker-sample.jar'
ENTRYPOINT ["java","-jar","/docker-sample.jar"]
EXPOSE 8080