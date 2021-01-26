FROM docker.xsy.io/base/jdk:8

COPY target/*.jar /opt/app.jar

#USER root

RUN apk update && apk --no-cache add curl

# RUN curl -O http://ompc.oss-cn-hangzhou.aliyuncs.com/jvm-sandbox/release/sandbox-stable-bin.zip
COPY ./sandbox /opt/sandbox/
#RUN unzip sandbox-stable-bin.zip

CMD ["java","-jar","/opt/app.jar"]

