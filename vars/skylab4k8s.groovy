#!/usr/bin/groovy

import script.Deploy2K8s

def call(body) {
    def appName = env.appName

    new Deploy2K8s().call(){}
}