pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Publish SpotBugs') {
            steps {
                 sh 'mvn spotbugs:spotbugs'
                 sh 'mvn spotbugs:check'
                 recordIssues(
                    tools: [spotBugs(useRankAsPriority: true)]
                 )
                 sh 'mvn site'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
