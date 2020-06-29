
organization := "$organization$"
scalaVersion := "$scalaVersion$"

lazy val root = (project in file(".")).
  settings(
    name := "g8-scala-sbt-simple",
    organization := "com.organization",
    scalaVersion := "2.13.2",
  )
