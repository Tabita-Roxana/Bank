package headquarterServer.networking;

import headquarterServer.model.ManageCustomerHeadquartersModel;
import headquarterServer.model.ManageCustomerHeadquartersModelImpl;
import shared.Customer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ManageCustomerHeadquartersImpl implements ManageCustomerHeadquarters
{
  private ManageCustomerHeadquartersModel modelHeadquarters;


  public ManageCustomerHeadquartersImpl(Registry registry) throws AlreadyBoundException,
      RemoteException
  {
    modelHeadquarters = new ManageCustomerHeadquartersModelImpl();
    UnicastRemoteObject.exportObject(this, 0);
    startServer(registry);
  }

  private void startServer(Registry registry) throws AlreadyBoundException, RemoteException
  {
    registry.bind("ManageCustomerHeadquarterServer", this);
    System.out.println("ManageCustomerHeadquarterServer is running!");
  }

  @Override public synchronized void addCustomer(Customer customer)
  {
    modelHeadquarters.addCustomer(customer);
  }

  @Override public synchronized  void deleteCustomer(Customer customer)
  {
    modelHeadquarters.deleteCustomer(customer);
  }

  @Override public synchronized  void editAddress(Customer customer, String address)
  {
    modelHeadquarters.editAddress(customer, address);
  }
}
