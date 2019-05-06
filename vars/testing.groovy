#!/usr/bin/env groovy

def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
	}