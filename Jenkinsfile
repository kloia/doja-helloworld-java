pipeline {
   agent any

   stages {
      stage('Pre') {
         steps {
            echo 'This is pre pipeline stage'
         }
      }
      stage('Docker build') {
         steps {
            sh 'docker build . -t realvega/dojo-java:basic -f Dockerfile.final'
         }
      }
      stage('Docker push') {
         steps {
            sh 'docker push realvega/dojo-java:basic'
         }
      }      
   }
}
