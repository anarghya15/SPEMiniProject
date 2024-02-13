pipeline {
    agent any
    
    environment {
        DOCKER_IMAGE_NAME = 'calculatorJava'
        GITHUB_REPO_URL = 'https://github.com/anarghya15/SPEMiniProject.git'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the GitHub repository
                git branch: 'main', url: "${GITHUB_REPO_URL}"
            }
        }
        
        stage('Build Maven Project') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }
        
        stage('Test Maven project') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
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
                    sh 'docker tag "${DOCKER_IMAGE_NAME}" anarghya15/calculatorJava:latest'
                    sh 'docker push anarghya15/calculatorJava'
                    }
                 }
            }
        }
        
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }
    }
}

