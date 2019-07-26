FROM alpine-jdk:base

MAINTAINER thomas.fuerer@voestalpine.com

COPY target/discovery-server-0.0.1-SNAPSHOT.jar /opt/lib/

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/discovery-server-0.0.1-SNAPSHOT.jar"]