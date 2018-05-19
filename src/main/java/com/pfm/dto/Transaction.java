package com.pfm.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

public class Transaction   {
  @JsonProperty("current_amount")
  private BigDecimal currentAmount = null;

  @JsonProperty("previous_amount")
  private BigDecimal previousAmount = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("investment_id")
  private String investmentId = null;

  @JsonProperty("investor_id")
  private String investorId = null;

  @JsonProperty("transaction_type")
  private Boolean transactionType = null;

  @JsonProperty("description")
  private String description = null;

  public Transaction currentAmount(BigDecimal currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }

  /**
   * Get currentAmount
   * @return currentAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getCurrentAmount() {
    return currentAmount;
  }

  public void setCurrentAmount(BigDecimal currentAmount) {
    this.currentAmount = currentAmount;
  }

  public Transaction previousAmount(BigDecimal previousAmount) {
    this.previousAmount = previousAmount;
    return this;
  }

  /**
   * Get previousAmount
   * @return previousAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getPreviousAmount() {
    return previousAmount;
  }

  public void setPreviousAmount(BigDecimal previousAmount) {
    this.previousAmount = previousAmount;
  }

  public Transaction date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Transaction time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Transaction investmentId(String investmentId) {
    this.investmentId = investmentId;
    return this;
  }

  /**
   * Get investmentId
   * @return investmentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getInvestmentId() {
    return investmentId;
  }

  public void setInvestmentId(String investmentId) {
    this.investmentId = investmentId;
  }

  public Transaction investorId(String investorId) {
    this.investorId = investorId;
    return this;
  }

  /**
   * Get investorId
   * @return investorId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getInvestorId() {
    return investorId;
  }

  public void setInvestorId(String investorId) {
    this.investorId = investorId;
  }

  public Transaction transactionType(Boolean transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isTransactionType() {
    return transactionType;
  }

  public void setTransactionType(Boolean transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.currentAmount, transaction.currentAmount) &&
        Objects.equals(this.previousAmount, transaction.previousAmount) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.time, transaction.time) &&
        Objects.equals(this.investmentId, transaction.investmentId) &&
        Objects.equals(this.investorId, transaction.investorId) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.description, transaction.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAmount, previousAmount, date, time, investmentId, investorId, transactionType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    previousAmount: ").append(toIndentedString(previousAmount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    investmentId: ").append(toIndentedString(investmentId)).append("\n");
    sb.append("    investorId: ").append(toIndentedString(investorId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

