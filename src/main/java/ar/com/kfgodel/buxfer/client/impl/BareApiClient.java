package ar.com.kfgodel.buxfer.client.impl;

import ar.com.kfgodel.buxfer.client.api.BuxferApiClient;
import ar.com.kfgodel.buxfer.client.api.exceptions.BuxferApiException;
import ar.com.kfgodel.buxfer.client.api.login.LoginResponse;
import ar.com.kfgodel.buxfer.client.api.login.LoginWrapper;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsResponse;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsWrapper;
import ar.com.kfgodel.buxfer.client.impl.retrofit.BuxferApi;
import retrofit2.Call;

import java.io.IOException;

/**
 * This type implements the api client using a retrofit client to offer
 * the simplest integration
 *
 * Date: 08/04/18 - 23:43
 */
public class BareApiClient implements BuxferApiClient {

  private BuxferApi api;

  public static BareApiClient create() {
    BareApiClient client = new BareApiClient();
    client.api = BuxferApi.create();
    return client;
  }

  @Override
  public LoginResponse login(String buxferUser, String buxferPassword) {
    Call<LoginWrapper> call = api.login(buxferUser, buxferPassword);
    return executeCall(call).getResponse();
  }

  @Override
  public TransactionsResponse transactions(int pageIndex, String sessionToken) {
    Call<TransactionsWrapper> call = api.transactions(pageIndex, sessionToken);
    return executeCall(call).getResponse();
  }

  private <T> T executeCall(Call<T> call){
    try {
      T responseBody = call.execute().body();
      return responseBody;
    } catch (IOException e) {
      throw new BuxferApiException("Failed to call buxfer endpoint: " + e.getMessage(),e);
    }
  }
}
