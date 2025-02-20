import java.awt.event.*;
import javax.swing.*;
public class AreaOfRectangle
{
    AreaOfRectangle()
 {
 JFrame jframe=new JFrame("Area of Rectangle");

 JLabel lblFirstNumber=new JLabel("Length");
 lblFirstNumber.setBounds(20, 30, 150, 20);
 jframe.add(lblFirstNumber);

 JTextField txtFirstNumber = new JTextField();
 txtFirstNumber.setBounds(150, 30, 150, 20);
 jframe.add(txtFirstNumber);

 JLabel lblSecondNumber=new JLabel("Breadth");
 lblSecondNumber.setBounds(20, 55, 150, 20);
 jframe.add(lblSecondNumber);

 JTextField txtSecondNumber=new JTextField();
 txtSecondNumber.setBounds(150, 55, 150, 20);
 jframe.add(txtSecondNumber);

 JLabel lblSum=new JLabel("Area");
 lblSum.setBounds(20,80,150,20);
 jframe.add(lblSum);

 JTextField txtSum=new JTextField();
 txtSum.setBounds(150, 80, 150,20);
 jframe.add(txtSum);

 JButton btnAdd=new JButton("Area of Rectangle");
 btnAdd.setBounds(50, 110, 80, 20);
 jframe.add(btnAdd);

 JButton btnCancel=new JButton("Cancel");
 btnCancel.setBounds(170, 110, 80, 20);
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
 int c=a*b;
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
 txtSum.setText(null);
 }
 }
 );
 }
 public static void main(String args[])
 {
 new AreaOfRectangle();

 }
}

