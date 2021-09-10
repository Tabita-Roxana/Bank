package client.client;

import shared.Customer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ManageCustomerClient extends Remote
{
  void addCustomer(Customer customer) throws RemoteException;
  void deleteCustomer(Customer customer) throws RemoteException;
  void editAddress(Customer customer, String address) throws RemoteException;
}
