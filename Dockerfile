FROM maven:3.8-adoptopenjdk-11 as build

COPY pom.xml /usr/src/app/pom.xml
RUN mvn -f /usr/src/app/pom.xml dependency:resolve dependency:resolve-plugins

COPY src /usr/src/app/src
COPY .git /usr/src/app/.git

ENV SPRING_PROFILES_ACTIVE=staging

RUN mvn -f /usr/src/app/pom.xml clean package \
    && mvn -f /usr/src/app/pom.xml jacoco:check

FROM bellsoft/liberica-openjdk-alpine-musl:11 AS executable

COPY --from=build ...

EXPOSE 8080
ENTRYPOINT ["", "entrypoint.sh"]
