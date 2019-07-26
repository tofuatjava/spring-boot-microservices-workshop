FROM alpine-jdk:base

MAINTAINER thomas.fuerer@voestalpine.com

COPY target/movie-info-service-0.0.1-SNAPSHOT.jar /opt/lib/

EXPOSE 8082

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/movie-info-service-0.0.1-SNAPSHOT.jar"]