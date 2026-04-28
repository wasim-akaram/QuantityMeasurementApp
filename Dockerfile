FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /workspace

COPY pom.xml .
COPY src ./src

RUN mvn -B -DskipTests package

FROM eclipse-temurin:17-jre-jammy AS runtime

WORKDIR /app

RUN useradd --system --create-home --uid 1001 appuser

COPY --from=build /workspace/target/*.jar /app/app.jar

EXPOSE 8080

USER appuser

ENTRYPOINT ["java", "-jar", "/app/app.jar"]