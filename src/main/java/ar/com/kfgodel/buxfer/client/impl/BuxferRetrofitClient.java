package ar.com.kfgodel.buxfer.client.impl;

import ar.com.kfgodel.buxfer.client.api.BuxferApiClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * This class implements the buxfer api client using retrofit
 * Date: 05/04/18 - 23:15
 */
public class BuxferRetrofitClient {

  public static BuxferApiClient create() {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://www.buxfer.com/api/")
      .addConverterFactory(JacksonConverterFactory.create())
      .build();
    return retrofit.create(BuxferApiClient.class);
  }

}
