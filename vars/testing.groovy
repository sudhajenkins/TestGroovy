#!/usr/bin/env groovy

def call() {
  echo "Hello"
  stage('core-Build') {
        steps{
          bat "cd ${WORKSPACE}/core && mvn clean install"
          }
        }
}