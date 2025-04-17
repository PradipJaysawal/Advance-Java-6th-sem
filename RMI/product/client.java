import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class client
{
 public static void main(String args[])throws RemoteException
 {
 client c=new client();
 c.connectRemote();
 }
 private void connectRemote()throws RemoteException
 {
 try
 {
 Registry reg=LocateRegistry.getRegistry("localhost",5000);
 Multiplication ad=(Multiplication) reg.lookup("Hi Server");
 System.out.println("Product: "+ad.multiply(5, 3));
 }
 catch(NotBoundException|RemoteException e)
 {
 System.out.println(e);
 }
 }
}