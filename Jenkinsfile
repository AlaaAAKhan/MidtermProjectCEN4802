pipeline {
    agent any

    tools {
    maven 'Maven3'
    jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh '/usr/local/bin/docker build -t discount-app .'
            }
        }
    }
}