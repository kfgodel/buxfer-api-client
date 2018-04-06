package ar.com.kfgodel.buxfer.client.api.transactions;

import ar.com.kfgodel.buxfer.client.api.support.ResponseSupport;

import java.util.List;

/**
 * Response for getting information on each transaction
 * Date: 05/04/18 - 23:48
 */
public class TransactionsResponse extends ResponseSupport {

  private Integer numTransactions;

  private List<Transaction> transactions;

  public Integer getNumTransactions() {
    return numTransactions;
  }

  public void setNumTransactions(Integer numTransactions) {
    this.numTransactions = numTransactions;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }
}
