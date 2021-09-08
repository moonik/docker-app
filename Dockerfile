FROM ubuntu

RUN apt-get update && apt-get -y install maven
RUN apt-get update && apt-get -y install openjdk-8-jdk
RUN update-java-alternatives --set java-1.8.0-openjdk-amd64

COPY . /opt/my-app

ENTRYPOINT MY_APP=/opt/my-app cd /opt/my-app && mvn spring-boot:run
