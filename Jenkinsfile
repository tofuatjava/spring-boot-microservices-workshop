pipeline {
  agent {
    node {
      label 'linux'
    }

  }
  stages {
    stage('build') {
      steps {
        withMaven(maven: 'maven:latest') {
          sh 'mvn clean package'
        }

      }
    }
    stage('docker openJDK image') {
      steps {
        sh 'docker build .'
      }
    }
  }
}