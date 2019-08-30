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
    stage('docker images') {
      steps {
        sh 'docker build .'
      }
	  
	  steps {
	    parallel {
		  discovery: {
		    sh 'docker build discovery-server/'
		  },
		  movie-catalog: {
		    sh 'docker build movie-catalog-service/'
		  }
		  movie-info: {
		    sh 'docker build movie-info-service/'
		  }
		  ratings: {
		    sh 'docker build ratings-data-service/'
		  }
		}
      }
    }
  }
}