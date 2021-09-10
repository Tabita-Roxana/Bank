package branchServer.model;

import shared.Customer;

public interface ManageCustomerBranchModel
{
  void addCustomer(Customer customer);
  void deleteCustomer(Customer customer);
  void editAddress(Customer customer, String address);
}
