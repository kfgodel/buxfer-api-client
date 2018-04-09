package ar.com.kfgodel.buxfer.client.api.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Types of transaction on buxfer api.<br>
 *    income | expense | transfer | refund | sharedBill | paidForFriend | loan
 * Date: 05/04/18 - 23:54
 */
public enum TransactionType {
  @JsonProperty("income")
  INCOME,
  @JsonProperty("expense")
  EXPENSE,
  @JsonProperty("transfer")
  TRANSFER,
  @JsonProperty("refund")
  REFUND,
  @JsonProperty("shared bill")
  SHARED_BILL,
  @JsonProperty("paid for friend")
  PAID_FOR_FRIEND,
  @JsonProperty("settlement")
  SETTLEMENT,
  @JsonProperty("loan")
  LOAN;
}
