FROM openjdk:17-jdk-alpine
MAINTAINER Mahmoud-Arabi
COPY target/*.jar cicd_github_action.jar
ENTRYPOINT ["java","-jar","/cicd_github_action"]