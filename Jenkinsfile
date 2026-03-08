pipeline {
    agent any
    triggers {
        githubPush()
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test with Maven') {
            steps {
                bat 'mvn clean test -Dmaven.test.failure.ignore=true'
            }
        }
        stage('Package WAR') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
        stage('SonarQube Analysis') {
           steps {
                bat 'mvn sonar:sonar -Dsonar.projectKey=covoiturage-jee -Dsonar.host.url=http://localhost:9005 -Dsonar.login=admin -Dsonar.password=admin'
             }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Build terminé avec succès'
        }
        failure {
            echo 'Des tests ont échoué'
        }
    }
}