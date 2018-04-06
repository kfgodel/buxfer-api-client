package ar.com.kfgodel.buxfer.client.api.login;

/**
 * Generic wrapper used by buxfer for every response. In this case for login endpoint
 * {"response":{"token":"74m0koj971ir50dbjhgmrg2vt1","status":"OK","request_id":1522981754}}
 * Date: 05/04/18 - 23:26
 */
public class LoginWrapper {

  private LoginResponse response;

  public LoginResponse getResponse() {
    return response;
  }

  public void setResponse(LoginResponse response) {
    this.response = response;
  }
}
