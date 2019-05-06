#!/usr/bin/env groovy

def call(){
    stage("Package artifact") {
        bat "mvn clean"
    }
}