package db

import com.typesafe.config._

/**This can be modified to make use of a reference conf file, check typesafe config
  * website under complex app examples, meanwhile we can still work with the config in
  * resource for now
  */
object MongoDatabaseHelper {

  val configmongo = ConfigFactory.load("mongoconf")
  println(configmongo.getString("mongodbclient.host"))
}