FROM ubuntu

RUN apt-get update && apt-get -y install maven

COPY . /opt/my-app

ENTRYPOINT MY_APP=/opt/my-app cd /opt/my-app && mvn spring-boot:run
