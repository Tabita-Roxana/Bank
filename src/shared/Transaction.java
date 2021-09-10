package shared;

import java.io.Serializable;
import java.sql.Timestamp;

public class Transaction implements Serializable
{
  private double amount;
  private Timestamp executedAt;

  public Transaction(double amount, Timestamp executedAt)
  {
    this.amount = amount;
    this.executedAt = executedAt;
  }

  public double getAmount()
  {
    return amount;
  }

  public void setAmount(double amount)
  {
    this.amount = amount;
  }

  public Timestamp getExecutedAt()
  {
    return executedAt;
  }

  public void setExecutedAt(Timestamp executedAt)
  {
    this.executedAt = executedAt;
  }

  @Override public String toString()
  {
    return "Transaction{" + "amount=" + amount + ", executedAt=" + executedAt
        + '}';
  }
}
