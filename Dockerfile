FROM openjdk:18-jdk-alpine
COPY target/TallerH2Render-0.0.1-SNAPSHOT.jar TallerH2render.jar

ENTRYPOINT [ "java", "-jar" , "TallerH2render.jar"]