package shared;

import java.io.Serializable;

public class Customer implements Serializable
{
  private String cpr, fName, lName, address;

  public Customer(String cpr, String fName, String lName, String address)
  {
    this.cpr = cpr;
    this.fName = fName;
    this.lName = lName;
    this.address = address;
  }

  public String getCpr()
  {
    return cpr;
  }

  public String getfName()
  {
    return fName;
  }

  public String getlName()
  {
    return lName;
  }

  public String getAddress()
  {
    return address;
  }

  public void setCpr(String cpr)
  {
    this.cpr = cpr;
  }

  public void setfName(String fName)
  {
    this.fName = fName;
  }

  public void setlName(String lName)
  {
    this.lName = lName;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  @Override public String toString()
  {
    return "Customer{" + "cpr='" + cpr + '\'' + ", fName='" + fName + '\''
        + ", lName='" + lName + '\'' + ", address='" + address + '\'' + '}';
  }
}
