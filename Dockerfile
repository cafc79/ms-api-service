# This is a Dockerfile for the ubi8/openjdk-11-runtime:1.13 image.
FROM registry.access.redhat.com/ubi8/openjdk-11-runtime:1.13-1
## START Practica 1 
## \
 
 LABEL COMPANY="Accenture"
 LABEL MAINTAINER="cesar.alberto.flores@accenture.com;"
 LABEL APPLICATION="ms-api-service"
 #LABEL Date={{ Release Date }}
 #LABEL Release={{ Release Code }}
 LABEL Name="login" Version="0.0.1-SNAPSHOT"
###### /
###### END image 'ubi8/openjdk-11-runtime:1.13'  

###### START Configure image 'ubi8/openjdk-11-runtime:1.13'
###### \

WORKDIR /app
COPY ./ms-api-service-0.0.1-SNAPSHOT.jar /app/ms-api-service-0.0.1-SNAPSHOT.jar
CMD java -jar /app/ms-api-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080

###### /
###### END Configure image 'ubi8/openjdk-11-runtime:1.13'
