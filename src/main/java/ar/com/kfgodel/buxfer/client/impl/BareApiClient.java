package ar.com.kfgodel.buxfer.client.impl;

import ar.com.kfgodel.buxfer.client.api.BuxferApiClient;
import ar.com.kfgodel.buxfer.client.api.exceptions.BuxferApiException;
import ar.com.kfgodel.buxfer.client.api.login.LoginResponse;
import ar.com.kfgodel.buxfer.client.api.login.LoginWrapper;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsResponse;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsWrapper;
import ar.com.kfgodel.buxfer.client.impl.retrofit.BuxferApi;
import retrofit2.Call;
import retrofit2.Response;

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
    TransactionsWrapper transactionsWrapper = executeCall(call);
    return transactionsWrapper.getResponse();
  }

  private <T> T executeCall(Call<T> call){
    try {
      Thread.sleep(1000);
      Response<T> response = call.execute();
      T responseBody = response.body();
      return responseBody;
    } catch (IOException e) {
      throw new BuxferApiException("Failed to call buxfer endpoint: " + e.getMessage(),e);
    } catch (InterruptedException e) {
      throw new BuxferApiException("Failed to wait before calling endpoint: " + e.getMessage(),e);
    }
  }
}
