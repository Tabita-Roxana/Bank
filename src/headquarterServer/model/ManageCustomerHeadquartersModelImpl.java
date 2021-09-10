package headquarterServer.model;

import shared.Customer;

import java.util.ArrayList;

public class ManageCustomerHeadquartersModelImpl implements ManageCustomerHeadquartersModel
{
  private ArrayList customers;

  public ManageCustomerHeadquartersModelImpl()
  {
    customers = new ArrayList();
  }

  @Override public void addCustomer(Customer customer)
  {
    customers.add(customer);
    System.out.println(customer);

  }

  @Override public void deleteCustomer(Customer customer)
  {
    customers.remove(customer);
  }

  @Override public void editAddress(Customer customer, String address)
  {
    customer.setAddress(address);
    System.out.println(customer + " " + address);
  }
}
