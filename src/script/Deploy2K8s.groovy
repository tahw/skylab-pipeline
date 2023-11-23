#!/usr/bin/groovy
package script

def call(body) {
    sh("pwd")
    echo 'hello world'
}