package bean;

public class SimplePropertyBeanMain
{
 public static void main(String args[])
 {
 SimplePropertyBean ob=new SimplePropertyBean();
 ob.setLength(5);
 ob.setBreadth(3);
 ob.setHeight(2);
 System.out.println("Volume:"+ob.getLength()*ob.getBreadth()*ob.getHeight());

 }
}
