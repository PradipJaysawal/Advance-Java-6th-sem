import java.awt.event.*;
import javax.swing.*;
public class SimpleInterest
{
    SimpleInterest()
 {
 JFrame jframe=new JFrame("Simple Interest");

 JLabel lblFirstNumber=new JLabel("Principal");
 lblFirstNumber.setBounds(20, 30, 150, 20);
 jframe.add(lblFirstNumber);

 JTextField txtFirstNumber = new JTextField();
 txtFirstNumber.setBounds(150, 30, 150, 20);
 jframe.add(txtFirstNumber);

 JLabel lblSecondNumber=new JLabel("Rate");
 lblSecondNumber.setBounds(20, 55, 150, 20);
 jframe.add(lblSecondNumber);

 JTextField txtSecondNumber=new JTextField();
 txtSecondNumber.setBounds(150, 55, 150, 20);
 jframe.add(txtSecondNumber);

 JLabel lblThirdNumber=new JLabel("Time");
 lblThirdNumber.setBounds(20, 85, 150, 20);
 jframe.add(lblThirdNumber);

 JTextField txtThirdNumber=new JTextField();
 txtThirdNumber.setBounds(150, 85, 150, 20);
 jframe.add(txtThirdNumber);

 JLabel lblSum=new JLabel("SI");
 lblSum.setBounds(20,110,150,20);
 jframe.add(lblSum);

 JTextField txtSum=new JTextField();
 txtSum.setBounds(150, 110, 150,20);
 jframe.add(txtSum);

 JButton btnAdd=new JButton("Simple Interest");
 btnAdd.setBounds(80, 150, 80, 20);
 jframe.add(btnAdd);

 JButton btnCancel=new JButton("Cancel");
 btnCancel.setBounds(170, 150, 80, 20);
 jframe.add(btnCancel);

 jframe.setLayout(null);
 jframe.setSize(400, 200);
 jframe.setVisible(true);
 jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 btnAdd.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent ae)
 {
 int a=Integer.parseInt(txtFirstNumber.getText());
 int b=Integer.parseInt(txtSecondNumber.getText());
 int d=Integer.parseInt(txtThirdNumber.getText());
 int c=(a*b*d)/100;
 txtSum.setText(" "+c);
 }
 }
 );

 btnCancel.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent ae)
 {
 txtFirstNumber.setText(null);
 txtSecondNumber.setText(null);
 txtThirdNumber.setText(null);
 txtSum.setText(null);
 }
 }
 );
 }
 public static void main(String args[])
 {
 new SimpleInterest();

 }
}

