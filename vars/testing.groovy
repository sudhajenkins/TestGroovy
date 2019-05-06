def call(){
    node {
        stage("core artifact") {
        bat "cd ${WORKSPACE}/core && mvn clean install"
    }



        stage("data-Build") {
        bat "cd ${WORKSPACE}/core && mvn clean install"
    }
        }


}