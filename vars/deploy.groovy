def call(Map config) {
       
       sh "cd /target"
       sh "\cp -fR petclinic.war /var/lib/tomcat/webapps"
       sh "service tomcat restart"

  
}
