FROM java:8
FROM maven:alpine

WORKDIR /app

COPY . /app

RUN mvn -v
RUN mvn clean install -DskipTests
EXPOSE 8080
ADD ./target/petshop-spring.jar petshop-spring.jar
ENTRYPOINT ["java", "-jar", "petshop-spring.jar"]