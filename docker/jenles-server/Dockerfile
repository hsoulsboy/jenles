FROM ubuntu:20.04

RUN apt-get update; \
    apt-get install -y maven

COPY . /jenles

WORKDIR /jenles

RUN mvn package

CMD mvn exec:java