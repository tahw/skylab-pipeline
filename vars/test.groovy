#!/usr/bin/groovy


def call(String name = 'skylab test'){
    echo "hello,${name}"
    skylab4k8s(){}
}