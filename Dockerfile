FROM java:8-jre
MAINTAINER Erwin Alberto

ENV SERVER_PORT 8000
EXPOSE 8000

#Local DB config
ENV SPRING_DATASOURCE_DRIVERCLASSNAME org.postgresql.Driver
ENV SPRING_DATASOURCE_JDBCURL jdbc:postgresql://localhost:5432/personalization
ENV SPRING_DATASOURCE_USERNAME xxxxxxxx
ENV SPRING_DATASOURCE_PASSWORD xxxxxxxx

#Application settings
ENV ERWINDEV_API_VERSION local

#Logging settings
#ENV ERWINDEV_ELK_HOST logstash.erwindev.com:5003

#Container setup
RUN mkdir /app
COPY ./build/libs/nameofproject-service-0.1.0.jar /app/

WORKDIR /app
CMD java -Dsun.net.inetaddr.ttl=0 -jar nameofproject-service-0.1.0.jar
