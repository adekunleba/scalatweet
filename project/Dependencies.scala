import sbt._  //For stuffs like this, this import is important
import Versions._


object Dependencies {
  //Twitter Dependencies
  val twitter4J = "org.twitter4j" % "twitter4j-core" % twitter4JVersion
  val mongodbScalaDriver = "org.mongodb.scala" %% "mongo-scala-driver" % mongodbScalabVersion
  val mongodbScalaBson = "org.mongodb.scala" %% "mongo-scala-bson" % mongodbScalabVersion
  val mongodbDriverCore = "org.mongodb" % "mongodb-driver-core" % mongodbDriverVersion
  val mongodbDriverAsync = "org.mongodb" % "mongodb-driver-async" %  mongodbDriverVersion
  val monogdbBson =  "org.mongodb" % "bson" % mongodbDriverVersion

  //Spark Dependencies
  val sparkStreaming = "org.apache.spark" %% "spark-streaming" % apacheSparkVersion
  val sparkSql = "org.apache.spark" %% "spark-sql" % apacheSparkVersion
  val sparkCore = "org.apache.spark" %% "spark-core" % apacheSparkVersion
  
  
  
  
  lazy val tweetAppDependencies = Seq(
    twitter4J,
    mongodbScalaDriver,
    mongodbScalaBson,
    mongodbDriverCore,
    mongodbDriverAsync
  )
  
  lazy val sparkAppDependencies = Seq (
    sparkStreaming,
    sparkSql,
    sparkCore
  )
}