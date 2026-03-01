pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // This compiles your code and runs JUnit tests
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                // This builds the image using the JAR created in the previous stage
                sh 'docker build -t discount-app .'
            }
        }
    }
}