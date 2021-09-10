package branchServer.networkingClient;

import branchServer.model.ManageCustomerBranchModel;
import branchServer.model.ManageCustomerBranchModelImpl;
import shared.Customer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ManageCustomerBranchClientRMI implements ManageCustomerBranchClient
{
  private ManageCustomerBranchModel modelBranch;

  public ManageCustomerBranchClientRMI(Registry registry) throws
      AlreadyBoundException,
      RemoteException
  {
    modelBranch = new ManageCustomerBranchModelImpl();
    UnicastRemoteObject.exportObject(this, 0);
    startServer(registry);
  }

  private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
  {
    registry.bind("ManageCustomerBranchServer", this);
    System.out.println("ManageCustomerBranchServer is running!");
  }


  @Override public synchronized void addCustomer(Customer customer) throws RemoteException
  {
    modelBranch.addCustomer(customer);
  }

  @Override public synchronized void deleteCustomer(Customer customer) throws RemoteException
  {
    modelBranch.deleteCustomer(customer);
  }

  @Override public synchronized void editAddress(Customer customer, String address)
      throws RemoteException
  {
    modelBranch.editAddress(customer, address);
  }
}
