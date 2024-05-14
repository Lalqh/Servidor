import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {
        try {
            Registry rmii = LocateRegistry.createRegistry(5000);
            rmii.rebind("Chat", (Remote) new implementacionChat());
            System.out.println("Servdior activo...");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
