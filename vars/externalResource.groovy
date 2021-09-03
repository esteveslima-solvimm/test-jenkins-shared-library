// call with externalResource()
def call() {
    def scriptName = "foo.sh"
    def scriptPath = "${scriptName}"    // reference from /resources folder

    // Load script from resources
    def content = libraryResource scriptPath
    writeFile file:scriptName, text:content
    sh "chmod a+x ./${scriptName}"

    // Run script
    sh "./${scriptName}"
}