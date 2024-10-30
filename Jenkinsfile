def gv
pipeline
{
    agent any
    environment
    {
        NEW_VERSION = '2.0.1'
        //SERVERCREDENTIALS =credentials('Server-credentials')
    }
    parameters
    {
        choice(name: 'VERSION',choices: ['1.2.1','1.2.2','2.1.0'])
        booleanParam(name: 'executeTests',defaultValue:true,description:'Decide to execute test in the build')
        choice(name: 'PLATFORM_FILTER', choices: ['all', 'linux', 'windows', 'mac'], description: 'Run on specific platform')
    }
    tools
    {
        maven 'M2'
        groovy 'Groovy'
    }
    stages 
    {
        stage('build')
        {
            steps
            {
                echo 'building the application '
                //echo 'current version > ${NEW_VERSION} ${SERVERCREDENTIALS}'
                sh 'mvn --version'
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
                //script
                //{
                    //gv.TestFunc()
                //}
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
            echo 'Send an email to team'
        }
        success
        {
            echo 'Send a success email that build is stable {params.VERSION}'
            //Execute integration test
        }
        failure
        {
            echo 'Send a failure email to build triggered person'
        }
    }
}
