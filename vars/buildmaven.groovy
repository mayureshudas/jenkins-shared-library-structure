def call(Map stageParams) {
 
    buildmaven(
        sh label: '', script: 'mvn package'
    )
  }
