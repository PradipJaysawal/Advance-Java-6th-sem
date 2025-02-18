import javax.swing.*;

public class JTableExample {
 JFrame f;
 JTable j;
 JTableExample()
 {
 f = new JFrame();
 f.setTitle("JTable Example");
 String[][] data = {
 { "Pradip Jayswal", "BCA" },
 { "Niraj G.C.","BIT" },
 {"Adarsha Parajuli","BSCCSIT"},
 { "Rabin Shrestha", "BCA" },
 { "Suhana Baral","BIT" },
 {"Adarsha Parajuli","BSCCSIT"},
 { "Rabin Shrestha", "BCA" },
 { "Suhana Baral","BIT" },
 {"Adarsha Parajuli","BSCCSIT"},
 { "Rabin Shrestha", "BCA" },
 { "Suhana Baral","BIT" },
 {"Adarsha Parajuli","BSCCSIT"}
 };
 String[] columnNames = { "Name", "Department" };
 j = new JTable(data, columnNames);
 j.setBounds(30, 40, 200, 300);
//  for scrollbar
 JScrollPane sp = new JScrollPane(j);
 f.add(sp);

 //without scrollbar
//  JScrollPane sp = new JScrollPane(j);
//  f.add(j);//-this should not be comment
 f.setSize(500, 200);
 f.setVisible(true);
 }
 public static void main(String[] args)
 {
 new JTableExample();
 }
}