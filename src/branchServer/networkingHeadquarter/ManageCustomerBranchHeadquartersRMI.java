package branchServer.networkingHeadquarter;

import headquarterServer.networking.ManageCustomerHeadquarters;
import shared.Customer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ManageCustomerBranchHeadquartersRMI implements ManageCustomerBranchHeadquarters
{
  private ManageCustomerHeadquarters headquarterServer;

  public ManageCustomerBranchHeadquartersRMI()
  {
    try
    {
      Registry registry = LocateRegistry.getRegistry(1099);
      headquarterServer = (ManageCustomerHeadquarters) registry.lookup("ManageCustomerHeadquarterServer");
    }
    catch (RemoteException | NotBoundException e)
    {
      throw new RuntimeException("Could not connect to the headquarter server");
    }
  }

  @Override public void addCustomer(Customer customer) throws RemoteException
  {
    try
    {
      headquarterServer.addCustomer(customer);
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
      headquarterServer.deleteCustomer(customer);
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
      headquarterServer.editAddress(customer, address);
    }
    catch (RemoteException e)
    {
      throw new RuntimeException("Error while editing address");
    }

  }
}
