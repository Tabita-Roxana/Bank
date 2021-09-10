package branchServer;

import branchServer.networkingClient.ManageCustomerBranchClient;
import branchServer.networkingClient.ManageCustomerBranchClientRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;

public class RunBranchServer
{
  public static void main(String[] args) throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(10990);

    ManageCustomerBranchClient branchClient = new ManageCustomerBranchClientRMI(registry);
  }

}
