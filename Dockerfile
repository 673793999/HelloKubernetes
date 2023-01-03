FROM openjdk:8
COPY target/HelloKubernetes-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
CMD java -jar HelloKubernetes-0.0.1-SNAPSHOT.jar