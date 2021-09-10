package client.model;

import client.client.ManageCustomerClient;
import client.client.ManageCustomerClientRMI;
import shared.Customer;

import java.rmi.RemoteException;

public class ManageCustomer
{
  private ManageCustomerClient client;

  public ManageCustomer()
  {
    client =  new ManageCustomerClientRMI();
  }

  public void addCustomer(Customer customer)
  {
    try
    {
      client.addCustomer(customer);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  public void deleteCustomer(Customer customer)
  {
    try
    {
      client.deleteCustomer(customer);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }
  public void editAddress(Customer customer, String address)
  {
    try
    {
      client.editAddress(customer, address);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }
}
