package ar.com.kfgodel.buxfer.client.api.transactions;

/**
 * An account reference used from a transaction.<br>
 *   {
 *     "id": 1004509,
 *       "name": "Hsbc Usd"
 *   }
 * Date: 06/04/18 - 00:00
 */
public class AccountReference {
  private Long id;
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static AccountReference create(Long accountId, String accountName) {
    AccountReference account = new AccountReference();
    account.id = accountId;
    account.name = accountName;
    return account;
  }

}
