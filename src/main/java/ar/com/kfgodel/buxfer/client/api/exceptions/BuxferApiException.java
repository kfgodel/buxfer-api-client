package ar.com.kfgodel.buxfer.client.api.exceptions;

/**
 * This class represents an error on buxfer api communication
 * Date: 08/04/18 - 23:55
 */
public class BuxferApiException extends RuntimeException {

  public BuxferApiException(String message) {
    super(message);
  }

  public BuxferApiException(String message, Throwable cause) {
    super(message, cause);
  }

  public BuxferApiException(Throwable cause) {
    super(cause);
  }
}
