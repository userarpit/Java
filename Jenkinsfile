pipeline {
  agent {
  label {
            label 'windows'
            retries 1
        }
  }
  
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          agent any
          steps {
            echo 'helllo'
            sleep 5
          }
        }

        stage('shell command') {
          steps {
            sh 'ls -al'
          }
        }

      }
    }

  }
}
