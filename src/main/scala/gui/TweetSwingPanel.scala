package gui

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTextArea

import scala.swing._
import scala.swing.{SimpleSwingApplication, event}
import scala.swing.event._


//TODO: Extend this object to be usable in the main method
object TweetSwingPanel{

  def showframe = {
    val textArea = new JTextArea
    textArea.setText("Hello, Swing World!")
    val scrollPane = new JScrollPane(textArea)

    val frame = new JFrame("Hello, Swing")
    frame.getContentPane.add(scrollPane, BorderLayout.CENTER)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setSize(new Dimension(600, 400))
    frame.setLocationRelativeTo(null)
    frame.setVisible(true)
  }

    object showframescalaswing {

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

    }
    def top = new MainFrame {
        title = "Tweet Box"
        contents = showframescalaswing.ui
    }
}