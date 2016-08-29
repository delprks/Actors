import sbt.Keys._
import sbt._
import Dependencies._

object CommonSettings {
  lazy val commonSettings = Seq(
    scalaVersion := "2.11.6",
    scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature"),
    libraryDependencies ++= dependencies,
    resolvers += Resolver.jcenterRepo
  ) ++ addCommandAlias("report", ";clean;scalastyle;coverage;test")
}
