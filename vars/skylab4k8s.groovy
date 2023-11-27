#!/usr/bin/groovy

import script.Deploy2K8s

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo 'hello ${config.name}'

    echo 'hello skylab4k8s'
    new Deploy2K8s().call(){}
}