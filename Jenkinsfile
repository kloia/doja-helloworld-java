pipeline {
   agent any

   stages {
      stage('Hello') {
         steps {
            sh 'docker build . -t dojo-java:basic -f Dockerfile.final'
         }
      }
   }
}
