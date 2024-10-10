pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your repository
                git 'https://github.com/ptkarthik/EpamModules.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the project (using Maven as an example)
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Run your tests
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
