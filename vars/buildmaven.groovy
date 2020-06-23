def buildmaven() {
       withMaven(maven: 'Maven 3') {
       sh 'mvn package'
  
   }
}
