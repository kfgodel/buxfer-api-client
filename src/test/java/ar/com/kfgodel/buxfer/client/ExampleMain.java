package ar.com.kfgodel.buxfer.client;

import ar.com.kfgodel.buxfer.client.api.BuxferApiClient;
import ar.com.kfgodel.buxfer.client.impl.BuxferRetrofitClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

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
    BuxferApiClient apiClient = BuxferRetrofitClient.create();
    String sessionToken = apiClient.login(args[0], args[1]).execute().body().getResponse().getToken();
    LOG.info("Got token: {}", sessionToken);


  }

}
