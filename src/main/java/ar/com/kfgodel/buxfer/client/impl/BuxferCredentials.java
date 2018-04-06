package ar.com.kfgodel.buxfer.client.impl;

import ar.com.kfgodel.buxfer.client.api.BuxferClientConfiguration;

/**
 * Date: 05/04/18 - 23:14
 */
public class BuxferCredentials implements BuxferClientConfiguration {

  private String user;
  private String pass;

  public static BuxferCredentials create(String user, String pass) {
    BuxferCredentials credentials = new BuxferCredentials();
    credentials.user = user;
    credentials.pass = pass;
    return credentials;
  }

}
