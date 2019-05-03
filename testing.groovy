#!/usr/bin/env groovy
def utils = new Utilities(env, steps)
node {
  utils.mvn 'clean install'
}

