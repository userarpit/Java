pipeline {
  agent any
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

        stage('') {
          steps {
            sh '"ls -al"'
          }
        }

      }
    }

  }
}