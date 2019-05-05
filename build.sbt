name := "lagos-scala-project"
organization in ThisBuild := "lgscala"
scalaVersion in ThisBuild := "2.11.12"


lazy val global = project
  .in(file("."))
  .settings(settings)
  .aggregate(
    tweetApp,
    sparkproject
  )

lazy val settings = commonSettings

lazy val tweetApp = project
  .settings(
    name := "tweetApp",
    settings,
    libraryDependencies ++= Dependencies.tweetAppDependencies
  )

lazy val sparkproject = project
  .settings(
    name := "sparkproject",
    settings,
    libraryDependencies ++= Dependencies.sparkAppDependencies
  )

lazy val compilerOptions = Seq(
  "-encoding", "utf8"
)

lazy val commonSettings = Seq (
  scalacOptions ++= compilerOptions
)

lazy val commonDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)