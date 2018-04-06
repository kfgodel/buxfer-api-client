package ar.com.kfgodel.buxfer.client.api.login;

import ar.com.kfgodel.buxfer.client.api.support.ResponseSupport;

/**
 * This is the response from a login attempt
 * {"token":"74m0koj971ir50dbjhgmrg2vt1","status":"OK","request_id":1522981754}
 * Date: 05/04/18 - 23:30
 */
public class LoginResponse extends ResponseSupport {

  private String token;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

}
