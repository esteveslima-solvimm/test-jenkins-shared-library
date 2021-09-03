// call with foo(anyParameter: "value", ...)
def call(Map config = [:]) {    
    sh "echo 'vars script!'"
    sh "echo $SOME_ENV_VAR"
    sh "echo ---"
    def configStr = config.inspect()
    sh "echo parameters: ${configStr}"

    // creat custom env var
    env.JOB_URL_NAME = env.JOB_URL.replaceFirst(/^.*\/([^\/]+?)$/, '$1')
    sh "echo $JOB_URL_NAME"
}