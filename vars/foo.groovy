// call with foo(anyParameter: "value", ...)
def call(Map config = [:]) {
    sh "echo 'vars script!'"
    sh "echo $SOME_ENV_VAR"
    sh "echo ---"
    def configStr = config.inspect()
    sh "echo parameters: ${configStr}"
}