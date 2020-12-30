
properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'environment', randomName: 'choice-parameter-1033414415022900', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return [\'dev\', \'qa\',\'prod\']']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'pipeline', randomName: 'choice-parameter-1033414418977500', referencedParameters: 'environment', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''import jenkins.*
import jenkins.model.* 
import hudson.*
import hudson.model.*
import groovy.json.*


def jenkinsCredentials = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        com.cloudbees.plugins.credentials.Credentials.class,
        Jenkins.instance,
        null,
        null
);
def creds
for (creds2 in jenkinsCredentials) {
    if(creds2.id == "git-token"){
      creds = creds2
    }
    }

HttpURLConnection connection;
def text;
    try {
 URL url = new URL(\'https://api.github.com/repos/developer-help/Test-Token/contents/pipeline.json\')
     connection = url.openConnection()
   // connection.setRequestMethod("GET")
connection.setRequestProperty("Authorization", "Bearer ${creds.password}");
connection.setRequestProperty("Accept", "application/vnd.github.v3+json");
connection.setDoOutput(true)
     text = connection.inputStream.text
def json = new JsonSlurper().parseText(text);
def fileDetails = json.content;
def map = new JsonSlurper().parseText(new String(fileDetails.decodeBase64()))
def names = map.pipelines.collect{ele -> ele.name}
return names
    } 
catch(Exception e) {
 return [e.dump()]
}
finally {
        connection.disconnect()
    }
    return [text]''']]]])])

node {
    // This displays colors using the 'xterm' ansi color map.
    def pipeline = "p1"
    stage("Hello") {
        def green = "green"
        echo "Hello" + " ${getGreen()} World"
     

        if("${pipeline}" == "p1" ) {
            echo "call pipeline p1"
        }
        else if("${pipeline}" == "p5" ) {
            echo "call pipeline ${pipeline}"
        }
        else {
            echo "default ${pipeline} is called"
        }
    }
}


public def getGreen() {
    return 'green'
}
