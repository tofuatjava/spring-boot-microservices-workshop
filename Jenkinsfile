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
    stage('build docker base image') {
      steps {
        sh 'docker build .'
      }
	}
    stage('build docker service images') {
	  parallel {
		stage('discovery') {
		  steps {
		    sh 'docker build discovery-server/'
		  }
		}
		stage('movie-catalog') {
		  steps {
		    sh 'docker build movie-catalog-service/'
	      }
		}
		stage('movie-info') {
		  steps {
		    sh 'docker build movie-info-service/'
		  }
		}
		stage('ratings') {
		  steps {
		    sh 'docker build ratings-data-service/'
		  }
		}
      }
    }
  }
}