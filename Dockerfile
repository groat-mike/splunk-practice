
FROM adoptopenjdk/openjdk11:alpine

ENV APP=splunk-practice

WORKDIR /app
COPY /target/$APP-*.jar $APP.jar

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app/$APP.jar ${0} ${@}"]
