FROM maven:3.8.1-adoptopenjdk-11 AS build

ENV APP /usr/src/app
ENV SPRING_PROFILES_ACTIVE=staging

COPY pom.xml ${APP}/pom.xml
COPY src ${APP}/src
COPY .git ${APP}/.git

RUN mvn -f ${APP}/pom.xml clean package verify

FROM bellsoft/liberica-openjdk-alpine-musl:11 AS app

ENV APP /usr/src/app

RUN addgroup --gid 1001 --system appuser \
    && adduser --uid 1001 --system appuser --ingroup appuser

COPY --from=build ${APP}/target/art-service.jar ${APP}/art-service.jar
COPY entrypoint.sh /

RUN chown -R 1001:1001 ${APP}
USER 1001
WORKDIR ${APP}

EXPOSE 8080 8125 9090

ENTRYPOINT ["/bin/bash", "/entrypoint.sh"]
