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
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Build et tests terminés avec succès'
        }
        failure {
            echo 'Échec du build ou des tests'
        }
    }
}
