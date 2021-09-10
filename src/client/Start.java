package client;

import client.client.ManageCustomerClient;
import client.client.ManageCustomerClientRMI;
import client.model.ManageCustomer;
import shared.Customer;

public class Start
{
  public static void main(String[] args)
  {
    ManageCustomer manageCustomer = new ManageCustomer();

    ManageCustomerClient manageCustomerClient = new ManageCustomerClientRMI();

    manageCustomer.addCustomer(new Customer("123", "Asda", "moidæaljd", "Horsens"));
  }
}
