pipeline {
    agent any
    stages {
       stage('List Directory') {
           steps {
               sh 'ls -l'
           }
       }
       stage('build') {
          steps {
              sh 'whoami'
              sh 'sudo docker build -t hb.k8sbridge.com/demo/spring-boot:latest .'
              sh 'sudo docker images'
          }
       }
    }
}
