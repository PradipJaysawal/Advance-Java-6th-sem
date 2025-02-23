import java.awt.event.*;
import javax.swing.*;
public class MouseClick extends MouseAdapter{
 int a,b,c,d;
 JLabel lblFirstNumber=new JLabel("First Number ");
 JTextField txtFirstNumber=new JTextField();
 JLabel lblSecondNumber=new JLabel("Second Number ");
 JTextField txtSecondNumber=new JTextField();
 JLabel lblResult=new JLabel("Result ");
 JTextField txtResult=new JTextField();
 MouseClick()
 {
 JFrame f=new JFrame("Sum Difference");
 lblFirstNumber.setBounds(10, 10, 100, 20);
 f.add(lblFirstNumber);

 txtFirstNumber.setBounds(150, 10, 100, 20);
 f.add(txtFirstNumber);

 lblSecondNumber.setBounds(10, 40, 100, 20);
 f.add(lblSecondNumber);

 txtSecondNumber.setBounds(150, 40, 100, 20);
 f.add(txtSecondNumber);

 lblResult.setBounds(10, 70, 100, 20);
 f.add(lblResult);

 txtResult.setBounds(150, 70, 100, 20);
 f.add(txtResult);

 f.addMouseListener(this);

 f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 }
 public static void main(String args[])
 {
 new MouseClick();
 }
 @Override
 public void mousePressed(MouseEvent e) {
 a=Integer.parseInt(txtFirstNumber.getText());
 b=Integer.parseInt(txtSecondNumber.getText());
 c=a+b;
 lblResult.setText("Sum");
 txtResult.setText(" "+c);
 }
 @Override
 public void mouseReleased(MouseEvent e) {
 a=Integer.parseInt(txtFirstNumber.getText());
 b=Integer.parseInt(txtSecondNumber.getText());
 d=a-b;
 lblResult.setText("Difference");
 txtResult.setText(" "+d);
 }
}