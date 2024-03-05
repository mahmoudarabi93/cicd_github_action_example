FROM openjdk:17-jdk-alpine
EXPOSE 8080
# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at the specified path
COPY target/cicd_github_action.jar /app/cicd_github_action.jar
ENTRYPOINT ["java","-jar","/cicd_github_action.jar"]