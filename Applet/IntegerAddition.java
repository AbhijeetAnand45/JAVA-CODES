/* NAME : ABHIJEET ANAND
   ROLL : 19103001 
   Write a program that creates a user interface to perform integer addition.
   Use jdk 1.8 version and give command javac integeraddition.java to compile the program 
    and give command appletviewer integeraddition.java to view the result in the applet viewer */
   

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   
   /*
   <applet code="IntegerAddition.class" width=350 height=300>
   
   </applet>
   */
   
   public class IntegerAddition extends JApplet implements ActionListener{
     JTextField number1,number2,result;
     
     JButton add;
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
         Label number1p = new Label("Number1: ",Label.RIGHT);
         Label number2p = new Label("Number2: ",Label.RIGHT);
         number1= new JTextField(20);
         number2 = new JTextField(20);
         result = new JTextField(20);
         add = new JButton("Add");
         add(number1p);
         add(number1);
         add(number2p);
         add(number2);
         add(result);
         add(add);
         add.addActionListener(this);
        
       }
       public void actionPerformed(ActionEvent e){
         String snumber1,snumber2;
         snumber1 = number1.getText();
         snumber2 = number2.getText();
         int number1 = Integer.parseInt(snumber1);
         int number2 = Integer.parseInt(snumber2);
         double r = (double)number1+number2;
         result.setText(((Double)r).toString());
       }
   }
