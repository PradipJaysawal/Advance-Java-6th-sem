import java.awt.event.*;
import javax.swing.*;
public class ChechNumber
{
    ChechNumber()
 {
 JFrame jframe=new JFrame("First number:");

 JLabel lblFirstNumber=new JLabel("first number");
 lblFirstNumber.setBounds(20, 30, 150, 20);
 jframe.add(lblFirstNumber);

 JTextField txtFirstNumber = new JTextField();
 txtFirstNumber.setBounds(150, 30, 150, 20);
 jframe.add(txtFirstNumber);


 JLabel lblSecondNumber=new JLabel("second");
 lblSecondNumber.setBounds(20, 80, 150, 20);
 jframe.add(lblSecondNumber);

 JTextField txtSecondNumber = new JTextField();
 txtSecondNumber.setBounds(150, 80, 150, 20);
 jframe.add(txtSecondNumber);



 JLabel lblThirdNumber=new JLabel("third");
 lblThirdNumber.setBounds(20, 130, 150, 20);
 jframe.add(lblThirdNumber);

 JTextField txtThirdNumber = new JTextField();
 txtThirdNumber.setBounds(150, 130, 150, 20);
 jframe.add(txtThirdNumber);

 JLabel lblSum=new JLabel("Results");
 lblSum.setBounds(20,180,150,20);
 jframe.add(lblSum);

 JTextField txtSum=new JTextField();
 txtSum.setBounds(150, 180, 150,20);
 jframe.add(txtSum);

 JButton btnAdd=new JButton("Check");
 btnAdd.setBounds(80, 210, 80, 20);
 jframe.add(btnAdd);


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
 if(a>b && a>d)
 txtSum.setText(" "+a);
 else if(b>a && b>d)
 txtSum.setText(" "+b);
 else 
 txtSum.setText(" "+d);
 }
 }
 );

}
public static void main(String args[])
{
new ChechNumber();

}
}
