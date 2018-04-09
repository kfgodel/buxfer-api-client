package ar.com.kfgodel.buxfer.client;

import ar.com.kfgodel.buxfer.client.api.login.LoginResponse;
import ar.com.kfgodel.buxfer.client.api.transactions.Transaction;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsResponse;
import ar.com.kfgodel.buxfer.client.impl.BareApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Takes two arguments as user and pass and list the accounts, contacts, tags and some transactions as example
 * Date: 05/04/18 - 23:08
 */
public class ExampleMain {
  public static Logger LOG = LoggerFactory.getLogger(ExampleMain.class);

  public static void main(String[] args) throws IOException {
    if(args.length != 2){
      LOG.warn("Usage: ExampleMain myBuxferUser mypassword");
      return;
    }
    LOG.info("Trying to log in");
    BareApiClient client = BareApiClient.create();
    LoginResponse loginResponse = client.login(args[0], args[1]);
    String sessionToken = loginResponse.getToken();
    LOG.info("Got token: {} on request: {}", sessionToken, loginResponse.getRequestId());

    LOG.info("Accessing transactions");
    TransactionsResponse transactionsResponse = client.transactions(0, sessionToken);
    List<Transaction> transactions = transactionsResponse.getTransactions();
    LOG.info("Found {} transactions, showing {}", transactionsResponse.getNumTransactions(), transactions.size());
    for (Transaction transaction : transactions) {
      LOG.info("{ id: {}, type: {}, description: {}, description: {} }", transaction.getId(), transaction.getType(), transaction.getAmount(), transaction.getDescription());
    }



  }

}
