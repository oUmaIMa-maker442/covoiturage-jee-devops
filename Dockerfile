# Étape 1 : Build avec Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY WebContent ./WebContent
RUN mvn clean package -DskipTests

# Étape 2 : Déploiement sur Tomcat
FROM tomcat:9.0-jdk21
LABEL maintainer="oumaima-lahkiar"
LABEL description="Application Covoiturage JEE"

# Supprimer les apps par défaut de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copier le WAR généré
COPY --from=build /app/target/covoiturage-jee-1.0.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Exposer le port 8080
EXPOSE 8080

# Démarrer Tomcat
CMD ["catalina.sh", "run"]