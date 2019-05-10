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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CreditDebitIndicator
 */
public enum CreditDebitIndicator {
  
  CREDIT("CREDIT"),
  
  DEBIT("DEBIT");

  private String value;

  CreditDebitIndicator(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CreditDebitIndicator fromValue(String text) {
    for (CreditDebitIndicator b : CreditDebitIndicator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

