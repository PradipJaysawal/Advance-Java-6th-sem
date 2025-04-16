import  java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements PriceCalculator {

    protected Server() throws RemoteException {
        super();
    }

    @Override
    public float calculateSellingPrice (float costPrice , float discount) throws RemoteException {

        return costPrice -discount;

    }

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("Hi Server", new Server());
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}