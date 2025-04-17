import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Multiplication extends Remote
{
 public int multiply(int x,int y) throws RemoteException;

}