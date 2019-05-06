def call(){
    node {
        stage("Package artifact") {
        sh "mvn package"
    }

        }


}