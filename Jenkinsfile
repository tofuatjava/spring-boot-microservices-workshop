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
  }
}