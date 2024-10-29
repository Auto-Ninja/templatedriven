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
            steps
            {
                echo 'testing the application'
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
