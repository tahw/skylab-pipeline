#!/usr/bin/groovy
package script

def call(body) {

    def jobName = env.JOB_NAME

    echo "jobName: ${jobName}"
    echo 'Deploy2K8s'
}