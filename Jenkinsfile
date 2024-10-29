pipeline
{
    agent any
    stages {
        stage('build')
        {
            steps
            {
                echo 'building the application'
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
            when
            {
                 expression
                {
                     BRANCH_NAME == 'feature/f1'
                }
            }
            steps
            {
                echo 'testing the application in feature/f1'
            }
        }
        stage('deploy')
        {
            steps
            {
                echo 'deploying the application'
            }
        }        
    }
    post
    {
        always
        {
            echo 'send an email to team'
        }
        sucess
        {
            echo 'send am email that build is stable'
            //Execute integration test
        }
        failure
        {
            echo 'send am email to build triggered person'
        }
    }
}

node
{
//groovy script
}
