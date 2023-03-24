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
                sh 'mvn clean install'
            }
        }
        
        stage("Unit test") {
            steps {
                sh "mvn test"
            }
        }
    }
}