def call(Map stageParams) {
 
    buildmaven([
        
         sh mvn package
    ])
  }
