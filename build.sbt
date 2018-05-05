import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scalatweet",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.twitter4j" % "twitter4j-core" % "4.0.6",
      "org.scala-lang.modules" %% "scala-swing" % "2.0.3"
     )
  )
