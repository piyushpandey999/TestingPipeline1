pipeline{
     agent any

         stages {
            stage('Code Checkout- Github') {
                     steps {
                         git 'https://github.com/piyushpandey999/TestingPipeline1.git'
                     }
                 }
               stage('Running Tests') {
                  steps {
                      echo "Domain is : ${params.Domain}"
                      echo "Domain Type is : ${params.domain_type}"
                      echo "Service is : ${params.ServiceName}"
                      echo "IP Port is : ${params.IP_Port}"


                       // ✅ Use Surefire style
                            // Use bat for Windows or sh for Unix/Linux
                            script {
                                           if (isUnix()) {
                                               sh "mvn clean test -Dmaven.repo.local=./local-maven-repo -o -Dtest=${params.ServiceName} -Dips=${params.IP_Port}"
                                           }
                                           else {
                                               bat "mvn clean test -Dmaven.repo.local=./local-maven-repo -o -Dtest=${params.ServiceName} -Dips=${params.IP_Port}"
                                           }
                            }
                     }
                  }
               }
           }