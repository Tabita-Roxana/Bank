package headquarterServer;

import headquarterServer.networking.ManageCustomerHeadquarters;
import headquarterServer.networking.ManageCustomerHeadquartersImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunHeadquarterServer
{
  public static void main(String[] args) throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(1099);

    ManageCustomerHeadquarters serverHeadquarters = new ManageCustomerHeadquartersImpl(registry);
  }
}
