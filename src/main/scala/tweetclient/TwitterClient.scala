package tweetclient

import example.Hello
import TwiiterClientHelper._
import gui.TweetScalaSwingPanel
import gui.TweetSwingPanel._



object TwitterClient {
  def main(args: Array[String]): Unit = {
    //print(consumerKey)
    showframe
    TweetScalaSwingPanel.main(args) //This is how to use main for projects that implicitly implement main method

//    while (it.hasNext()) {
//      val status = it.next
//      println(status.getUser.getName + ":" + status.getText)
//    }
  }
}