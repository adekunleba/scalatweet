package tweetclient

import example.Hello
import TwiiterClientHelper._
import gui.TweetScalaSwingPanel
import gui.TweetSwingPanel._



object TwitterClient {
  def main(args: Array[String]): Unit = {
    //print(consumerKey)
    showframe
    TweetScalaSwingPanel.main(args)

//    while (it.hasNext()) {
//      val status = it.next
//      println(status.getUser.getName + ":" + status.getText)
//    }
  }
}