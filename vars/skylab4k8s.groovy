#!/usr/bin/groovy

import script.Deploy2K8s

def call(body) {
    echo 'hello skylab4k8s'
    new Deploy2K8s().call(){}
}