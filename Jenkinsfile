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
              sh 'docker build -t hb.k8sbridge.com/demo/spring-boot:latest .'
              sh 'docker images'
          }
       }
    }
}
