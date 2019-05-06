def call(){
    node {
        stage("Package artifact") {
        bat "mvn package"
    }

        }


}