package ar.com.kfgodel.buxfer.client.impl.retrofit;

import ar.com.kfgodel.buxfer.client.api.login.LoginWrapper;
import ar.com.kfgodel.buxfer.client.api.transactions.TransactionsWrapper;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This type defines the http api for retrofit to create the client
 * Date: 05/04/18 - 23:11
 */
public interface BuxferApi {

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


  static BuxferApi create() {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://www.buxfer.com/api/")
      .addConverterFactory(JacksonConverterFactory.create())
      .build();
    return retrofit.create(BuxferApi.class);
  }

}
