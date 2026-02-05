pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/oUmaIMa-maker442/covoiturage-jee-devops.git'
            }
        }

        stage('Build & Test with Maven') {
            steps {
                bat 'mvn clean verify'
            }
        }
    }

    post {
        success {
            echo 'Build Maven terminé avec succès'
        }
        failure {
            echo 'Échec du build Maven'
        }
    }
}
