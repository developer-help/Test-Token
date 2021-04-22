# Test-Token

## Jenkins Pipeline with Active choice reactive parameter Using Git content API

Git repo of working code
https://github.com/developer-help/Test-Token

Youtube video
https://youtu.be/pC3K3XtAov4

Prerequisite
1. Jenkins is locally available or on cloud.
2. Need to have git hub account
3. A repo needs to be created in git with name Test-Token
4. Generated personal token on git with all privileges
5. Configure personal token in jenkins under security credentials
6. Multi branch pipeline creation support in jenkins
7. Opening of snippet generator in seperate window
8. Active choice reactive parameter plugin in jenkins

Assumptions
1. You have basic knowledge of Jenkins pipeline and jenkins file
   https://www.jenkins.io/doc/book/pipeline/jenkinsfile/#handling-parameters
   https://opensource.com/article/18/8/devops-jenkins-2
2. Familiar with basic grovy syntax.
3. Aware of try catch block
4. Declaritive pipeline syntax
   https://www.jenkins.io/doc/book/pipeline/syntax/
5. How to install jenkins and related plugins in case you are using developer box.
   https://www.jenkins.io/download/

Objective
1. Usage of Pipeline Snippet generator
2. Using Git api to populate parameters for job.
3. Using new git credentials token for accessing git hosted json 
4. Using Credentials api on jenkins for getting the credentials.
4. Understanding active choice reactive parameter 
5. Troubleshooting active choice parameter if something goes wrong (Why conventional method of troubleshooting fails ?)
6. Using basic HttpConnection to access git hosted files in job
7. Using "jenkinsFile" to create Jenkins job



Steps:
1. Create a git repo.
2. Generate personal access token
3. Configure credentials in jenkins and use token from step 2.
3. Create a JenkinsFile with declarative pipeline syntax and copy the code from sample except properties.
4. Create a Multi branch pipeline job in jenking and use the git repo url and credentials.
5. Use pipeline snippet generator and create two parameters (Environment and Pipeline) 
and copy paste the code from sample groovy file.
6. Generate snippet and copy the code and paste it in JenkinsFile at the start.
7. Go to jenkins and click on scan the pipeline from the job created in step 4.
8. Click on build with parameter you should see two input environment and pipeline. If you choose prod
env you will see only create option in secode if you choose dev you will see create/update/cleanup coming
from file hosted on git.
