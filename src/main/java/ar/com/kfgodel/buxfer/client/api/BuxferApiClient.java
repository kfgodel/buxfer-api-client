package ar.com.kfgodel.buxfer.client.api;

import ar.com.kfgodel.buxfer.client.api.exceptions.BuxferApiException;
import ar.com.kfgodel.buxfer.client.api.login.LoginResponse;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsResponse;

/**
 * This type represents the client for the http api, making each endpoint available as methods.<br>
 *   From https://www.buxfer.com/help/api
 *
 * Date: 08/04/18 - 23:41
 */
public interface BuxferApiClient {

  /**
   * https://www.buxfer.com/help/api#login
   */
  LoginResponse login(String buxferUser, String buxferPassword) throws BuxferApiException;

  /**
   * https://www.buxfer.com/help/api#transactions
   */
  TransactionsResponse transactions(int pageIndex, String sessionToken);
}
