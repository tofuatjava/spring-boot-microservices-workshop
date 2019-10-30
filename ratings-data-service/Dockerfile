FROM voestalpine-openjdk11

LABEL MAINTAINER=thomas.fuerer@voestalpine.com

COPY target/ratings-data-service-*.jar /opt/lib/

RUN mv /opt/lib/ratings-data-service-*.jar /opt/lib/ratings-data-service.jar

EXPOSE 8083

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/ratings-data-service.jar"]