FROM openjdk:17-alpine

ADD build/libs/NurBnbC-1.0-SNAPSHOT*.jar NurBnbC-1.0-SNAPSHOT.jar

COPY build/libs/NurBnbC-1.0-SNAPSHOT*.jar app.jar

ENV JAVA_TOOL_OPTIONS "-XX:+UseG1GC"

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "/NurBnbC-1.0-SNAPSHOT.jar", "--server.port=8083"]