import sbt._

object Dependencies {

  lazy val dependencies = {
    val akkaVersion = "2.3.6"
    val sprayVersion = "1.3.3"
    val specs2Version = "3.7.2"//(mpm) New version of Specs2 has some compatibility issues with Spray. Beware!

    Seq(
      "io.spray"                %%  "spray-can"                           % sprayVersion,
      "io.spray"                %%  "spray-routing"                       % sprayVersion,
      "io.spray"                %%  "spray-client"                        % sprayVersion,
      "io.spray"                %%  "spray-caching"                       % sprayVersion,
      //"io.spray"                %%  "spray-json"                          % "1.2.6",
      "io.spray"                %%  "spray-httpx"                         % sprayVersion,
      "com.typesafe.akka"       %%  "akka-actor"                          % akkaVersion,
      "com.typesafe.akka"       %%  "akka-testkit"                        % akkaVersion,
      "io.spray"                %%  "spray-testkit"                       % sprayVersion,
      "org.specs2"              %%  "specs2-core"                         % specs2Version,
      "org.specs2"              %%  "specs2-junit"                        % specs2Version,
      "org.specs2"              %%  "specs2-mock"                         % specs2Version
    )
  }
}
