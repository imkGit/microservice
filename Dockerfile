# Build:
#   docker build -t ikhanfir:microservice .
#
# Run:
#   docker run -t -p 8080:8080 ikhanfir:microservice
#

FROM store/oracle/serverjre:8
MAINTAINER Imen KHANFIR <khanfir.imen@gmail.com>

ADD target/microservice-0.0.1-SNAPSHOT.jar /app/microservice-0.0.1-SNAPSHOT.jar
# ADD microservice.yml /conf/microservice.yml

CMD java -jar /app/microservice-0.0.1-SNAPSHOT.jar server /conf/microservice.yml

EXPOSE 8080
