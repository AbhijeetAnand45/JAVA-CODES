import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Graphics;

/*

<applet code="DivApplet" width=350 height=300>

</applet>

*/

public class DivApplet extends Applet implements ActionListener{

JTextField number1,number2,result;

JButton divide;

public void init(){


  try {
    SwingUtilities.invokeAndWait(
      new Runnable() {
        public void run() {
          makeGUI();

        }
     });
    } 
    catch (Exception exc) {
      System.out.println("Can't create because of " + exc);

        }

    }

  private void makeGUI(){
    setLayout(new FlowLayout());
    JLabel label = new JLabel("You are successfully running a swing applet");
    label.setHorizontalAlignment(JLabel.CENTER);
    Label number1p = new Label("Number1: ",Label.RIGHT);
    Label number2p = new Label("Number2: ",Label.RIGHT);

    number1= new JTextField(20);

    number2 = new JTextField(20);

    result = new JTextField(20);

    divide = new JButton("Divide");
    add(number1p);
    add(number1);
    add(number2p);
    add(number2);
    add(result);
    add(divide);
    divide.addActionListener(this);

}

  public void actionPerformed(ActionEvent e){

  String snumber1,snumber2;

  snumber1 = number1.getText();

  snumber2 = number2.getText();

  try{

  int number1 = Integer.parseInt(snumber1);

  int number2 = Integer.parseInt(snumber2);

  if(number2==0){
    JOptionPane.showMessageDialog(null, "Division by zero not defined.");
  }

  

  else{

    double r = (double)number1/number2;
    result.setText(((Double)r).toString());

    }

        }

      catch(NumberFormatException ne)

  {

  JOptionPane.showMessageDialog(null,"Enter a number");

  }

   }

}
