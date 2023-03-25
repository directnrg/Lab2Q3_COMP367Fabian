pipeline {
    agent any
    tools {
        maven 'maven3.9'
    }
    
    stages {
        stage('Check out') {
            steps {
                echo "current build_id is ${env.BUILD_ID}"
                git branch: 'main', url: 'https://github.com/directnrg/Lab2Q3_COMP367Fabian.git'
            }
        }
        stage("Build maven project") {
            steps {
                bat 'mvn clean install'
            }
        }
        
        stage("Unit test") {
            steps {
                bat "mvn test"
            }
        }
        stage('Create Docker image') {
            steps {
                script {
                    bat "docker build -t directnrg/lab3q1-image:${env.BUILD_ID} ."
                }
            }
        }
        stage('Login to Docker') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'd7bd5eda-0996-4863-b410-99f036fc2b32',
                        passwordVariable: 'dockerhub-pwd', usernameVariable: 'dockerhub-username')]) {
                    
                    bat "docker login -u ${dockerhub_username} -p ${dockerhub_pwd}"
                }
            }
        }
        
        stage('Push Docker image') {
            steps {
                script {
                    bat "docker push directnrg/lab3q1-image:${env.BUILD_ID}"
                }
            }
        }
    }
}