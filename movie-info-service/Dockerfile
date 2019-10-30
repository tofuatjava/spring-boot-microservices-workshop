FROM voestalpine-openjdk11

LABEL MAINTAINER=thomas.fuerer@voestalpine.com

COPY target/movie-info-service-*.jar /opt/lib/

RUN mv /opt/lib/movie-info-service-*.jar /opt/lib/movie-info-service.jar

EXPOSE 8082

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/movie-info-service.jar"]