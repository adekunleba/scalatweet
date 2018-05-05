package gui

import scala.swing.{FlowPanel, Label, MainFrame, SimpleSwingApplication, Swing, TextField}
import scala.swing.event._


object TweetScalaSwingPanel extends SimpleSwingApplication{

  def newField = new TextField {
    text = "0"
    columns = 5
  }

  val hashTag = newField
  val word = newField

  //(hashTag, word)
  //        reactions += { // Here is what happens when any of the edit is done
  //            case EditDone()
  //        }
  lazy val ui = new FlowPanel(hashTag, new Label(" Hash Tag = "),
    word, new Label(" word = ")){
    border = Swing.EmptyBorder(15, 10, 10, 10)
  }
  def top = new MainFrame {
    title = "Tweet Box"
    contents = ui
  }

}