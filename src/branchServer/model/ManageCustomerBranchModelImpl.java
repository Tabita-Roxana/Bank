package branchServer.model;

import branchServer.networkingHeadquarter.ManageCustomerBranchHeadquarters;
import branchServer.networkingHeadquarter.ManageCustomerBranchHeadquartersRMI;
import shared.Customer;

import java.rmi.RemoteException;

public class ManageCustomerBranchModelImpl implements ManageCustomerBranchModel
{
  private ManageCustomerBranchHeadquarters branchHeadquarterServer;

  public ManageCustomerBranchModelImpl()
  {
    branchHeadquarterServer = new ManageCustomerBranchHeadquartersRMI();
  }

  @Override public void addCustomer(Customer customer)
  {
    try
    {
      branchHeadquarterServer.addCustomer(customer);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void deleteCustomer(Customer customer)
  {
    try
    {
      branchHeadquarterServer.deleteCustomer(customer);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void editAddress(Customer customer, String address)
  {
    try
    {
      branchHeadquarterServer.editAddress(customer, address);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }

  }
}
