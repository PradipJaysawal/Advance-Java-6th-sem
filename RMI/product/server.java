import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class server extends UnicastRemoteObject implements Multiplication
{
server()throws RemoteException
{
 super();
}
public int multiply(int x,int y)
{
 return x*y;
}
public static void main(String args[])
{
 try
 {
 Registry reg=LocateRegistry.createRegistry(5000);
 reg.rebind("Hi Server",new server());
 System.out.println("Server is ready ...");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
}
}