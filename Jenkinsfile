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
                // Exécute les tests SANS bloquer le pipeline
                bat 'mvn clean test -Dmaven.test.failure.ignore=true'
            }
        }
    }

    post {
        always {
            // Publier les résultats des tests dans Jenkins
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
