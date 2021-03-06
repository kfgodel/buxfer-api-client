package ar.com.kfgodel.buxfer.client.api.transactions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * Information for a single transaction
 * Date: 05/04/18 - 23:52
 */
public class Transaction {
  private Long id;
  public static final String id_FIELD = "id";

  private String description;
  public static final String description_FIELD = "description";

  private String date;
  private String normalizedDate;
  public static final String normalizedDate_FIELD = "normalizedDate";

  private String type;
  private String transactionType;
  private Double amount;
  private Double expenseAmount; // negative for income
  private Long accountId;// 0 means no account
  private String accountName; // null for no account
  private String tags;
  private List<String> tagNames;
  private String status;
  @JsonProperty("isFutureDated")
  private Boolean isFutureDated;
  private AccountReference fromAccount;
  private AccountReference toAccount;

  public boolean esAnteriorA(String fechaDeCorteNormalizada) {
    // Aunque comparamos strings, como están en formato iso, siguen la misma relacion de orden
    return this.getNormalizedDate().compareTo(fechaDeCorteNormalizada) < 0;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getNormalizedDate() {
    return normalizedDate;
  }

  public void setNormalizedDate(String normalizedDate) {
    this.normalizedDate = normalizedDate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(Double expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public List<String> getTagNames() {
    return tagNames;
  }

  public void setTagNames(List<String> tagNames) {
    this.tagNames = tagNames;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @JsonIgnore
  public boolean isPastDated(){
    return !getIsFutureDated();
  }

  public Boolean getIsFutureDated() {
    return isFutureDated;
  }

  public void setIsFutureDated(Boolean isFutureDated) {
    this.isFutureDated = isFutureDated;
  }

  public AccountReference getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(AccountReference fromAccount) {
    this.fromAccount = fromAccount;
  }

  public AccountReference getToAccount() {
    return toAccount;
  }

  public void setToAccount(AccountReference toAccount) {
    this.toAccount = toAccount;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
      .add(id_FIELD, id)
      .add(normalizedDate_FIELD, normalizedDate)
      .add(description_FIELD, description)
      .toString();
  }
}
