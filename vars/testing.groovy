def call(){
    node {
        stage("core artifact") {
        bat "cd ${WORKSPACE}/spring-mvc-example && mvn clean install"
    }



        stage("data-Build") {
        bat "cd ${WORKSPACE}/spring-mvc-example && mvn clean install"
    }

	stage('Docker core-api-accumulation Build and Publish') {
            echo "hello in stage docket core-api"
            }
        }    
          steps {
              
            //  sh "docker build -t core-api-accumulation ${WORKSPACE}/core-api/core-api-accumulation/"
              //sh "aws ecr get-login --no-include-email --region us-east-1 > ~/login.sh"
             // sh "chmod +x ~/login.sh"
             // sh "~/login.sh"
             // sh "docker tag core-api-accumulation:latest 754547079812.dkr.ecr.us-east-1.amazonaws.com/core-api-accumulation:latest"
             // sh "docker push 754547079812.dkr.ecr.us-east-1.amazonaws.com/core-api-accumulation:latest"
    
            }
            }
			stage('Docker core-api-analytics Build and Publish') {
          echo "hello in stage docket core-api"  
            }
        }    
          steps {
    
            // sh "docker build -t core-api-analytics ${WORKSPACE}/core-api/core-api-analytics/"      
             //sh "docker tag core-api-analytics:latest 754547079812.dkr.ecr.us-east-1.amazonaws.com/core-api-analytics:latest"
             //sh "docker push 754547079812.dkr.ecr.us-east-1.amazonaws.com/core-api-analytics:latest"
    
            }
        }


}