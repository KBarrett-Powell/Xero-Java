/*
 * Bank Feeds API
 * The Xero Bank Feeds API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.models.bankfeeds.CreditDebitIndicator;
import io.swagger.annotations.ApiModelProperty;

/**
 * EndBalance
 */

public class EndBalance {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("creditDebitIndicator")
  private CreditDebitIndicator creditDebitIndicator = null;

  public EndBalance amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "10.1340", value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public EndBalance creditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(value = "")
  public CreditDebitIndicator getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicator creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndBalance endBalance = (EndBalance) o;
    return Objects.equals(this.amount, endBalance.amount) &&
        Objects.equals(this.creditDebitIndicator, endBalance.creditDebitIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndBalance {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

