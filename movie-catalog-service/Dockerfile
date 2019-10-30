FROM voestalpine-openjdk11

MAINTAINER thomas.fuerer@voestalpine.com

COPY target/movie-catalog-service-*.jar /opt/lib/

RUN mv /opt/lib/movie-catalog-service-*.jar /opt/lib/movie-catalog-service.jar

EXPOSE 8081

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/movie-catalog-service.jar"]