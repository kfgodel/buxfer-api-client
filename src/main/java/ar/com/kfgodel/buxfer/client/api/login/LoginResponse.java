package ar.com.kfgodel.buxfer.client.api.login;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the response from a login attempt
 * {"token":"74m0koj971ir50dbjhgmrg2vt1","status":"OK","request_id":1522981754}
 * Date: 05/04/18 - 23:30
 */
public class LoginResponse {

  private String token;

  private String status;

  @JsonProperty("request_id")
  private String requestId;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
}
