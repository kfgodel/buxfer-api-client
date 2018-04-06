package ar.com.kfgodel.buxfer.client.api;

import ar.com.kfgodel.buxfer.client.api.login.LoginWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This type represents the client for the http api, making each endpoint available as methods
 * Date: 05/04/18 - 23:11
 */
public interface BuxferApiClient {

  @GET("login")
  Call<LoginWrapper> login(@Query("userid") String userid, @Query("password") String password);


}
