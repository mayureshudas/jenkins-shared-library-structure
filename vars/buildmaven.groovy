def call() {
       buildmaven(
              shell("mvn package").execute()
  )
}
