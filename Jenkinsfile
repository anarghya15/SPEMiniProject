pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE_NAME = 'calculatorJava'
        GITHUB_REPO_URL = 'https://github.com/anarghya15/SPEMiniProject.git'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git "${GITHUB_REPO_URL}"
            }
        }
        
        stage('Build Maven Project') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }
        
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag calculator calculator:latest'
                    sh 'docker push calculator'
                    }
                 }
            }
        }
    }
}
