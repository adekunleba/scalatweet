package gui

import scala.swing.{Button, Dimension, FlowPanel, GridPanel, Label, MainFrame, SimpleSwingApplication, Swing, TextField}
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
  lazy val ui = new FlowPanel(new Label(" Hash Tag = "),hashTag,
    new Label(" word = "), word){
    border = Swing.EmptyBorder(15, 10, 10, 10)
  }

  lazy val addButton = new Button {
    //Implements Add Button to be added to ui.contents
    text = "Submit!"
    reactions += {
      case ButtonClicked(_) => text = "Submitted"
    }
  }
  ui.contents += addButton

  def top = new MainFrame {
    title = "Tweet Box"
    contents = ui

    size = new Dimension(600, 480)
  }

}