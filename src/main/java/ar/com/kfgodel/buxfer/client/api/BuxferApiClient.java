package ar.com.kfgodel.buxfer.client.api;

import ar.com.kfgodel.buxfer.client.api.login.LoginWrapper;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This type represents the client for the http api, making each endpoint available as methods.<br>
 *   From https://www.buxfer.com/help/api
 * Date: 05/04/18 - 23:11
 */
public interface BuxferApiClient {

  /**
   * https://www.buxfer.com/help/api#login
   */
  @GET("login")
  Call<LoginWrapper> login(@Query("userid") String userid, @Query("password") String password);

  /**
   * https://www.buxfer.com/help/api#transactions
   */
  @GET("transactions")
  Call<TransactionsWrapper> transactions(@Query("page") Integer page, @Query("token") String token);

}
