import jenkins.*
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
 URL url = new URL('https://api.github.com/repos/developer-help/Test-Token/contents/pipeline.json')
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
if("${environment}" == 'prod') {
 return ['create']
}
return names
    } 
catch(Exception e) {
 return [e.dump()]
}
finally {
        connection.disconnect()
    }
    return [text]
