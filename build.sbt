name := "Actors"

version := "1.0"

scalaVersion := "2.11.8"

import CommonSettings._

lazy val root = (project in file(".")).
  enablePlugins(plugins.JvmPlugin).
  settings(commonSettings: _*).
  settings(
    organization := "delprks",
    name := "Actors",
    version := "1.0"
  )
