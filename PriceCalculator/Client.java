import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[] args) throws RemoteException
    {
        Client c = new Client();
        c.connectRemote();
    }
    private void connectRemote() throws RemoteException
    {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost", 5000);
            PriceCalculator ad = (PriceCalculator) reg.lookup("Hi Server");
            System.err.println("Selling Prce: " + ad.calculateSellingPrice(5000, 50));
        }catch (NotBoundException|RemoteException e){
            System.out.println(e);
        }
    }
}

