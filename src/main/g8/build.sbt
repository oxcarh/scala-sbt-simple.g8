// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.2"

lazy val root = (project in file(".")).
  settings(
    name := "g8-scala-sbt-simple"
  )
