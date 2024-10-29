def gv
pipeline
{
    agent any
    environment
    {
        NEW_VERSION = '2.0.1'
        //SERVERCREDENTIALS =credentials('Server-credentials')
    }
    parameters{
        choice(name: 'VERSION',choices: ['1.2.1','1.2.2','2.1.0'])
        booleanParam(name: 'executeTests',defaultValue:true,description:'Decide to execute test in the build')
    }
    tools
    {
        maven 'M2'
    }
    stages {
        stage('build')
        {
            steps
            {
                echo 'building the application '
                //echo 'current version > ${NEW_VERSION} ${SERVERCREDENTIALS}'
                sh 'mvn --version'
                script
                {
                    gv = load "script.groovy"
                }
            }
        }
        stage('test')
        {
            when
            {
                expression
                {
                    BRANCH_NAME == 'master' || BRANCH_NAME == 'master'
                }
            }
            steps
            {
                echo 'testing the application in master dev code'
            }
            // when
            // {
            //      expression
            //     {
            //          BRANCH_NAME == 'feature/f1' && params.executeTests
            //     }
            // }
            // steps
            // {
            //     echo 'testing the application in feature/f1'
            // }
        }
        stage('deploy')
        {
            steps
            {
                echo 'deploying the application'
                script
                {
                    gv.TestFunc()
                }
                // withCredentials([
                //     usernamePassword(credentials:'Server-credentials',
                //     usernameVariable:USER,passwordVariable:PWD
                //     )
                // ])
                // {
                //     sh "some script ${USER} ${PWD}"
                // }
            }
        }        
    }
    post
    {
        always
        {
            echo 'send an email to team'
        }
        success
        {
            echo 'send am email that build is stable {params.VERSION}'
            //Execute integration test
        }
        failure
        {
            echo 'send am email to build triggered person'
        }
    }
}