FROM voestalpine-openjdk11

MAINTAINER thomas.fuerer@voestalpine.com

COPY target/movie-catalog-service-0.0.1-SNAPSHOT.jar /opt/lib/

EXPOSE 8081

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/movie-catalog-service-0.0.1-SNAPSHOT.jar"]