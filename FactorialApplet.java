/* Name : Abhijeet Anand
    Roll : 19103001  
    Develop an applet that receives an integer in one text field and computes its factorial value. 
    Return its result value in another text field when the button named compute is clicked.   */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

<applet code="FactorialApplet" width=400 height=400>

</applet>

*/

public class FactorialApplet extends Applet implements ActionListener{
    TextField number,factorial;
    Button compute;
    public void init(){
        Label numberp = new Label("Please Enter a Number: ");
        Label factorialp = new Label("Factorial value: ");
        number= new TextField(30);
        factorial = new TextField(30);
        compute = new Button("Compute");
        add(numberp);
        add(number);
        add(factorialp);
        add(factorial);
        add(compute);
        compute.addActionListener(this);

    }

public void actionPerformed(ActionEvent e){
    String snumber;
    snumber = number.getText();
    int inumber = Integer.parseInt(snumber);
    factorial.setText(((Double)getFactorial(inumber)).toString());
    }
double getFactorial(int k){
    double fact = 1;
    for(int i=1;i<=k;i++)
        fact = fact * i;
    return fact;

    }

}