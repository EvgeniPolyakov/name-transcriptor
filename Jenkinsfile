pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/EvgeniPolyakov/Latin-to-Russian-name-transcriptor.git'
                sh './mvnw clean compile'
            }
        }
        stage('Publish') {
            steps {
                sh './mvnw package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
