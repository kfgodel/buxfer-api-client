package ar.com.kfgodel.buxfer.client.api.support;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Superclass with shared attributes between different response types
 * Date: 05/04/18 - 23:50
 */
public class ResponseSupport {

  private String status;

  @JsonProperty("request_id")
  private String requestId;

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
