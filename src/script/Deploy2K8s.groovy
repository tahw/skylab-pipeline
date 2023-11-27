#!/usr/bin/groovy
package script

def call(body) {

    def jobName = env.JOB_NAME

    echo "jobName: ${jobName}"


    // 应用环境
    def branch = env.BRANCH_NAME.replace('branches/','')
    if (branch == null || branch == '') {
        throw new RuntimeException("branch is null..")
    }
    echo "branch: ${branch}"
    echo 'Deploy2K8s'
}