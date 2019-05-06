def call(){
    node {
        stage("core artifact") {
        bat "cd ${WORKSPACE}/spring-mvc-example && mvn clean install"
    }



        stage("data-Build") {
        bat "cd ${WORKSPACE}/spring-mvc-example && mvn clean install"
    }
        }


}