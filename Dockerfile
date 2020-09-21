FROM openjdk:11
ADD target/Phase5project.jar Phase5project.jar 
EXPOSE 8085
ENTRYPOINT ["java","-jar","Phase5project.jar"]