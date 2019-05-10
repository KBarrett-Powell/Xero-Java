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
 * PayRun
 */

public class PayRun {
	
  @JsonProperty("PayRunID")
  private UUID payRunID;
  
  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PeriodStartDate")
  private OffsetDateTime periodStartDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PeriodEndDate")
  private OffsetDateTime periodEndDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PaymentDate")
  private OffsetDateTime paymentDate;
  
  @JsonProperty("TotalCost")
  private Double totalCost;
  
  @JsonProperty("TotalPay")
  private Double totalPay;
	
  /**
   * See PayRun Status
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    POSTED("POSTED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("PayRunStatus")
  private StatusEnum payRunStatus;
  
  /**
   * See PayRun Type
   */
  public enum TypeEnum {
	SCHEDULED("SCHEDULED"),
    
	UNSCHEDULED("UNSCHEDULED"),
	
	EARLIERYEARUPDATE("EARLIERYEARUPDATE");

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

  @JsonProperty("PayRunType")
  private TypeEnum payRunType;
  
  /**
   * See Calendar Type
   */
  public enum CalTypeEnum {
	  WEEKLY("Weekly"),
	  
	  FORTNIGHTLY("Fortnightly"),
	  
	  FOURWEEKLY("FourWeekly"),
	  
	  MONTHLY("Monthly"),
	  
	  ANNUAL("Annual"),
	  
	  QUARTERLY("Quarterly");

    private String value;

    CalTypeEnum(String value) {
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
    public static CalTypeEnum fromValue(String text) {
      for (CalTypeEnum b : CalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("CalendarType")
  private CalTypeEnum calendarType;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("PostedDateTime")
  private OffsetDateTime postedDateTime;
  
  @JsonProperty("PayslipMessage")
  private String payslipMessage;
  
  @JsonProperty("PaySlips")
  private List<PaySlip> paySlips;
  
  @JsonProperty("InvalidPayeeIDs")
  private String invalidPayeeIDs;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PayRun payRunID(UUID payRunID) {
	 this.payRunID = payRunID;
	 return this;
  }
  /**
	* Xero generated unique identifier for payRun
	* @return payRunID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for payRun")
  public UUID getPayRunID() {
	 return payRunID;
  }
  public void setPayRunID(UUID payRunID) {
	 this.payRunID = payRunID;
  }
  
  public PayRun payrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
	 return this;
  }
  /**
    * Xero generated unique identifier for payrollCalendar
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for payrollCalendar")
  public UUID getPayrollCalendarID() {
	 return payrollCalendarID;
  }
  public void setPayrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
  } 
  
  /**
   * Period Start Date
   * @return periodStartDate
  **/
  @ApiModelProperty(value = "Period Start Date")
  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
  }
  
  /**
   * Period End Date
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "Period End Date")
  public OffsetDateTime getPeriodEndDate() {
    return periodEndDate;
  }
  
  /**
   * Payment Date
   * @return paymentDate
  **/
  @ApiModelProperty(value = "Payment Date")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }
  
  /**
   * Total cost of pay run
   * @return totalCost
  **/
  @ApiModelProperty(value = "Total cost of pay run")
  public Double getTotalCost() {
    return totalCost;
  }
  
  /**
   * Total pay
   * @return totalPay
  **/
  @ApiModelProperty(value = "Total pay")
  public Double getTotalPay() {
     return totalPay;
  }
  
  public PayRun payRunStatus(StatusEnum payRunStatus) {
	 this.payRunStatus = payRunStatus;
	 return this;
  }
  /**
	* See PayRun Status
	* @return status
  **/
  @ApiModelProperty(required = true, value = "See PayRun Status")
  public StatusEnum getPayRunStatus() {
	 return payRunStatus;
  }
  public void setPayRunStatus(StatusEnum payRunStatus) {
	 this.payRunStatus = payRunStatus;
  }

  public PayRun payRunType(TypeEnum payRunType) {
    this.payRunType = payRunType;
    return this;
  }
  /**
   * See PayRun Types
   * @return payRunType
  **/
  @ApiModelProperty(required = true, value = "See PayRun Types")
  public TypeEnum getPayRunType() {
    return payRunType;
  }
  public void setPayRunType(TypeEnum payRunType) {
    this.payRunType = payRunType;
  }
  
  public PayRun calendarType(CalTypeEnum calendarType) {
	this.calendarType = calendarType;
	return this;
  }
  /**
	* See PayRun Calendar Types
	* @return calendarType
  **/
  @ApiModelProperty(required = true, value = "See PayRun Calendar Types")
  public CalTypeEnum getCalendarType() {
	return calendarType;
  }
  public void setCalendarType(CalTypeEnum calendarType) {
	this.calendarType = calendarType;
  }
  
  /**
   * Posted Date Time
   * @return postedDateTime
  **/
  @ApiModelProperty(value = "Posted Date Time")
  public OffsetDateTime getPostedDateTime() {
    return postedDateTime;
  }
  
  public PayRun payslipMessage(String payslipMessage) {
	this.payslipMessage = payslipMessage;
	return this;
  }
  /**
	* Payslip message - optional
	* @return payslipMessage
  **/
  @ApiModelProperty(value = "Payslip message - optional")
  public String getPayslipMessage() {
	return payslipMessage;
  }
  public void setPayslipMessage(String payslipMessage) {
	this.payslipMessage = payslipMessage;
  }
  
  public PayRun paySlips(List<PaySlip> paySlips) {
	this.paySlips = paySlips;
	return this;
  }
  /**
    * Payslips
	* @return paySlips
  **/
  @ApiModelProperty(value = "Payslips")
  public List<PaySlip> getPaySlips() {
	return paySlips;
  }
  public void setPaySlips(List<PaySlip> paySlips) {
	this.paySlips = paySlips;
  }
  
  public PayRun invalidPayeeIDs(String invalidPayeeIDs) {
	this.invalidPayeeIDs = invalidPayeeIDs;
	return this;
  }
  /**
	* Invalid Payee IDs
	* @return invalidPayeeIDs
  **/
  @ApiModelProperty(value = "Invalid Payee IDs")
  public String getInvalidPayeeIDs() {
	return invalidPayeeIDs;
  }
  public void setInvalidPayeeIDs(String invalidPayeeIDs) {
	this.invalidPayeeIDs = invalidPayeeIDs;
  }
  
  public PayRun validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PayRun addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PayRun payRun = (PayRun) o;
    return Objects.equals(this.payRunID, payRun.payRunID) &&
        Objects.equals(this.payrollCalendarID, payRun.payrollCalendarID) &&
        Objects.equals(this.periodStartDate, payRun.periodStartDate) &&
        Objects.equals(this.periodEndDate, payRun.periodEndDate) &&
        Objects.equals(this.paymentDate, payRun.paymentDate) &&
        Objects.equals(this.totalCost, payRun.totalCost) &&
        Objects.equals(this.totalPay, payRun.totalPay) &&
        Objects.equals(this.payRunStatus, payRun.payRunStatus) &&
        Objects.equals(this.payRunType, payRun.payRunType) &&
        Objects.equals(this.calendarType, payRun.calendarType) &&
        Objects.equals(this.postedDateTime, payRun.postedDateTime) &&
        Objects.equals(this.payslipMessage, payRun.payslipMessage) &&
        Objects.equals(this.paySlips, payRun.paySlips) &&
        Objects.equals(this.invalidPayeeIDs, payRun.invalidPayeeIDs) &&
        Objects.equals(this.validationErrors, payRun.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payRunID, payrollCalendarID, periodStartDate, periodEndDate, paymentDate, totalCost, totalPay, payRunStatus, payRunType, calendarType, postedDateTime, payslipMessage, paySlips, invalidPayeeIDs, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRun {\n");
    
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    payRunStatus: ").append(toIndentedString(payRunStatus)).append("\n");
    sb.append("    payRunType: ").append(toIndentedString(payRunType)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    postedDateTime: ").append(toIndentedString(postedDateTime)).append("\n");
    sb.append("    payslipMessage: ").append(toIndentedString(payslipMessage)).append("\n");
    sb.append("    paySlips: ").append(toIndentedString(paySlips)).append("\n");
    sb.append("    invalidPayeeIDs: ").append(toIndentedString(invalidPayeeIDs)).append("\n");
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

