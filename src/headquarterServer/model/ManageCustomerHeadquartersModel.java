package headquarterServer.model;

import shared.Customer;

public interface ManageCustomerHeadquartersModel
{
  void addCustomer(Customer customer);
  void deleteCustomer(Customer customer);
  void editAddress(Customer customer, String address);
}
