package ar.com.kfgodel.buxfer.client.api.transactions;

/**
 * Wrapper for transactions response (used by buxfer for some reason)
 *
 * Date: 05/04/18 - 23:48
 */
public class TransactionsWrapper {
  private TransactionsResponse response;

  public TransactionsResponse getResponse() {
    return response;
  }

  public void setResponse(TransactionsResponse response) {
    this.response = response;
  }
}
