#!/usr/bin/env groovy

def packageArtifact(){
    stage("Package artifact") {
        sh "mvn package"
    }
}