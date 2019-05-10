/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PayRunCalendar
 */

public class PayRunCalendar {
	
  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;
  
  @JsonProperty("Name")
  private String name;
	
  /**
   * See Calendar Type
   */
  public enum TypeEnum {
	  WEEKLY("WEEKLY"),
	  
	  FORTNIGHTLY("FORTNIGHTLY"),
	  
	  FOURWEEKLY("FOURWEEKLY"),
	  
	  MONTHLY("MONTHLY"),
	  
	  ANNUAL("ANNUAL"),
	  
	  QUARTERLY("QUARTERLY");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("CalendarType")
  private TypeEnum calendarType;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PeriodStartDate")
  private OffsetDateTime periodStartDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PeriodEndDate")
  private OffsetDateTime periodEndDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PaymentDate")
  private OffsetDateTime paymentDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PayRunCalendar payrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
	 return this;
  }
  /**
    * Xero generated unique identifier for the pay run calendar
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for the pay run calendar")
  public UUID getPayrollCalendarID() {
	 return payrollCalendarID;
  }
  public void setPayrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
  } 
  
  public PayRunCalendar name(String name) {
	 this.name = name;
	 return this;
  }
  /**
   * Name of the calendar
   * @return name
  **/
  @ApiModelProperty(value = "Name of the calendar")
  public String getName() {
    return name;
  }
  public void setName(String name) {
	 this.name = name;
  }
  
  public PayRunCalendar calendarType(TypeEnum calendarType) {
	this.calendarType = calendarType;
	return this;
  }
  /**
	* Type of the calendar. See Pay Run Calendar types
	* @return calendarType
  **/
  @ApiModelProperty(required = true, value = "Type of the calendar. See Pay Run Calendar types")
  public TypeEnum getCalendarType() {
	return calendarType;
  }
  public void setCalendarType(TypeEnum calendarType) {
	this.calendarType = calendarType;
  }
  
  public PayRunCalendar periodStartDate(OffsetDateTime periodStartDate) {
	this.periodStartDate = periodStartDate;
	return this;
  }
  /**
   * Period start date of the calendar
   * @return periodStartDate
  **/
  @ApiModelProperty(value = "Period start date of the calendar")
  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }
  public void setPeriodStartDate(OffsetDateTime periodStartDate) {
	this.periodStartDate = periodStartDate;
  }
  
  public PayRunCalendar periodEndDate(OffsetDateTime periodEndDate) {
	this.periodEndDate = periodEndDate;
	return this;
  }
  /**
   * Period End Date of the calendar
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "Period End Date of the calendar")
  public OffsetDateTime getPeriodEndDate() {
    return periodEndDate;
  }
  public void setPeriodEndDate(OffsetDateTime periodEndDate) {
	this.periodEndDate = periodEndDate;
  }
  
  public PayRunCalendar paymentDate(OffsetDateTime paymentDate) {
	this.paymentDate = paymentDate;
	return this;
  }
  /**
   * Payment Date of the calendar
   * @return paymentDate
  **/
  @ApiModelProperty(value = "Payment Date of the calendar")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(OffsetDateTime paymentDate) {
	this.paymentDate = paymentDate;
  }
  
  public PayRunCalendar updatedDateUTC(OffsetDateTime updatedDateUTC) {
	this.updatedDateUTC = updatedDateUTC;
	return this;
  }
  /**
   * UTC timestamp of the last update to the pay run calendar
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of the last update to the pay run calendar")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
	this.updatedDateUTC = updatedDateUTC;
  }
  
  public PayRunCalendar validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PayRunCalendar addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PayRunCalendar payRun = (PayRunCalendar) o;
    return Objects.equals(this.payrollCalendarID, payRun.payrollCalendarID) &&
        Objects.equals(this.name, payRun.name) &&
        Objects.equals(this.calendarType, payRun.calendarType) &&
        Objects.equals(this.periodStartDate, payRun.periodStartDate) &&
        Objects.equals(this.periodEndDate, payRun.periodEndDate) &&
        Objects.equals(this.paymentDate, payRun.paymentDate) &&
        Objects.equals(this.updatedDateUTC, payRun.updatedDateUTC) &&
        Objects.equals(this.validationErrors, payRun.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollCalendarID, name, calendarType, periodStartDate, periodEndDate, paymentDate, updatedDateUTC, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRunCalendar {\n");
    
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

