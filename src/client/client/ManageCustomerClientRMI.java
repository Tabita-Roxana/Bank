package client.client;

import branchServer.networkingClient.ManageCustomerBranchClient;
import shared.Customer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ManageCustomerClientRMI implements ManageCustomerClient
{
  private ManageCustomerBranchClient branchClientServer;

  public ManageCustomerClientRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      branchClientServer = (ManageCustomerBranchClient) registry.lookup("ManageCustomerBranchServer");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the branch server");
    }
  }

  @Override public void addCustomer(Customer customer) throws RemoteException
  {
    try
    {
      branchClientServer.addCustomer(customer);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while adding customer");
    }

  }

  @Override public void deleteCustomer(Customer customer) throws RemoteException
  {
    try
    {
      branchClientServer.deleteCustomer(customer);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while deleting customer");
    }

  }

  @Override public void editAddress(Customer customer, String address)
      throws RemoteException
  {
    try
    {
      branchClientServer.editAddress(customer, address);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing");
    }

  }
}
