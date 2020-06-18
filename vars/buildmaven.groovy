def call() {
 
    buildmaven(
        sh label: '', script: './mvnw spring-boot:run'
    )
  }
