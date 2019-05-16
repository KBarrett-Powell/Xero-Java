/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * LeaveBalance
 */

public class LeaveBalance {
	
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  
  @JsonProperty("balance")
  private Double balance;
  
  @JsonProperty("typeOfUnits")
  private String typeOfUnits;
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public LeaveBalance name(String name) {
	 this.name = name;
	 return this;
  }
  /**
	* Name of the leave type
	* @return name
  **/
  @ApiModelProperty(value = "Name of the leave type")
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  }
  
  public LeaveBalance leaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
	 return this;
  }
  /**
    * The Xero identifier for leave type. See leavetypes
	* @return leaveTypeID
  **/
  @ApiModelProperty(value = "The Xero identifier for leave type. See leavetypes")
  public UUID getLeaveTypeID() {
	 return leaveTypeID;
  }
  public void setLeaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
  } 
  
  public LeaveBalance balance(Double balance) {
    this.balance = balance;
    return this;
  }
  /**
   * The employees current balance for the corresponding leave type
   * @return balance
  **/
  @ApiModelProperty(value = "The employees current balance for the corresponding leave type")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }
  
  public LeaveBalance typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }
  /**
   * The type of the units of the leave
   * @return typeOfUnits
  **/
  @ApiModelProperty(value = "The type of the units of the leave")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }
  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }
  
  public LeaveBalance validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LeaveBalance addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays array of validation error messages from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveBalance leaveBalance = (LeaveBalance) o;
    return Objects.equals(this.name, leaveBalance.name) &&
        Objects.equals(this.leaveTypeID, leaveBalance.leaveTypeID) &&
        Objects.equals(this.balance, leaveBalance.balance) &&
        Objects.equals(this.typeOfUnits, leaveBalance.typeOfUnits) &&
        Objects.equals(this.validationErrors, leaveBalance.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, leaveTypeID, balance, typeOfUnits, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveBalance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

