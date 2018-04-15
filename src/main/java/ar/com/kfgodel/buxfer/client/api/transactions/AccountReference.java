package ar.com.kfgodel.buxfer.client.api.transactions;

import com.google.common.base.MoreObjects;

import java.util.Comparator;
import java.util.Objects;

/**
 * An account reference used from a transaction.<br>
 *   {
 *     "id": 1004509,
 *       "name": "Hsbc Usd"
 *   }
 * Date: 06/04/18 - 00:00
 */
public class AccountReference implements Comparable<AccountReference> {
  private Long id;
  public static final String id_FIELD = "id";

  private String name;
  public static final String name_FIELD = "name";


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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AccountReference)) return false;
    AccountReference that = (AccountReference) o;
    return Objects.equals(getName(), that.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
      .add(id_FIELD, id)
      .add(name_FIELD, name)
      .toString();
  }

  public static AccountReference create(Long accountId, String accountName) {
    AccountReference account = new AccountReference();
    account.id = accountId;
    account.name = accountName;
    return account;
  }

  @Override
  public int compareTo(AccountReference o) {
    return Objects.compare(this.getName(), o.getName(), Comparator.naturalOrder());
  }
}
