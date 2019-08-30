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
		sh 'docker tag alpine-jdk:latest'
      }
	}
    stage('build docker service images') {
	  parallel {
		stage('discovery') {
		  steps {
		    sh 'docker build discovery-server/'
			sh 'docker tag discovery-server:latest'
		  }
		}
		stage('movie-catalog') {
		  steps {
		    sh 'docker build movie-catalog-service/'
			sh 'docker tag movie-catalog:latest'
	      }
		}
		stage('movie-info') {
		  steps {
		    sh 'docker build movie-info-service/'
			sh 'docker tag movie-info:latest'
		  }
		}
		stage('ratings') {
		  steps {
		    sh 'docker build ratings-data-service/'
			sh 'docker tag ratings:latest'
		  }
		}
      }
    }
  }
}