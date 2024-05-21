pipeline {
    agent {
        label {
            label 'Windows'
            retries 1
        }
    }
    options {
        skipStagesAfterUnstable()
        disableResume()
        timestamps()
        timeout(time: 1, unit: 'HOURS') 
    }
    stages {
        stage('code compilation') {
            steps {
                sh 'mvn compile'
            }
        }
	    stage('code review') {
	        steps {
                sh 'mvn pmd:pmd'
            }
        }
	    stage('unit test') {
            steps {
                sh 'mvn test'
            }
        }
    /*    stage('Matric Check') {
            steps {
    //            jdk = tool name: 'jdk8'
    //	        env.JAVA_HOME = "${jdk}"
	            sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'
            }
        }
	stage('Package') {
            steps {
                sh 'mvn package'
            }
        }*/
        stage('Matrix Stage') {
            failFast true
            matrix {
                axes {
                    axis {
                        name 'PLATFORM'
                        values 'linux', 'mac', 'windows'
                    }
                    axis {
                        name 'BROWSER'
                        values 'chrome', 'edge', 'firefox', 'safari'
                    }
                }
                stages {
                    stage('build') {
                        steps {
                            echo "build"
                        }
                    }
                    stage('test') {
                        steps {
                            echo "test"
                        }
                    }
                }
                excludes {
                    exclude {
                        axis {
                            name 'PLATFORM'
                            values 'linux'
                        }
                        axis {
                            name 'BROWSER'
                            values 'safari'
                        }
                    }
                }
            }
        }
        
        
        stage('scripted pipeline example') {
            steps {
                echo 'Hello World'

                script {
                    def browsers = ['chrome', 'firefox']
                    for (int i = 0; i < browsers.size(); ++i) {
                        echo "Testing the ${browsers[i]} browser"
                    }
                }
            }
        }
        
    }
    
    post { 
        always { 
            echo 'Pipeline complete'
        }
    }
}
