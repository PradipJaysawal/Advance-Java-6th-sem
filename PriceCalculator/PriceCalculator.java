import java.rmi.Remote;
import java.rmi.RemoteException;
public interface PriceCalculator extends Remote
{
    public float calculateSellingPrice (float costPrice, float discount) throws RemoteException;
}