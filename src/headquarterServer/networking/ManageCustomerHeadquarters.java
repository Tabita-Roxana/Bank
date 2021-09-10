package headquarterServer.networking;

import shared.Customer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ManageCustomerHeadquarters extends Remote
{
  void addCustomer(Customer customer) throws RemoteException;
  void deleteCustomer(Customer customer) throws RemoteException;
  void editAddress(Customer customer, String address) throws RemoteException;
}
