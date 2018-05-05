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
      "org.scala-lang.modules" %% "scala-swing" % "2.0.3",
      "org.mongodb.scala" %% "mongo-scala-driver" % "2.3.0",
      "org.mongodb.scala" %% "mongo-scala-bson" % "2.3.0",
      "org.mongodb" % "mongodb-driver-core" % "3.7.0",
      "org.mongodb" % "mongodb-driver-async" % "3.7.0",
      "org.mongodb" % "bson" % "3.7.0",
      "com.typesafe" % "config" % "1.3.3"
     )
  )
