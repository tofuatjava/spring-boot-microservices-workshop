FROM alpine-jdk:base

MAINTAINER thomas.fuerer@voestalpine.com

COPY target/ratings-data-service-0.0.1-SNAPSHOT.jar /opt/lib/

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/ratings-data-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8083