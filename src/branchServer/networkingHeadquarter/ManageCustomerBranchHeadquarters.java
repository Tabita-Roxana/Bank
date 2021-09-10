package branchServer.networkingHeadquarter;

import shared.Customer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ManageCustomerBranchHeadquarters extends Remote
{
  void addCustomer(Customer customer) throws RemoteException;
  void deleteCustomer(Customer customer) throws RemoteException;
  void editAddress(Customer customer, String address) throws RemoteException;
}
