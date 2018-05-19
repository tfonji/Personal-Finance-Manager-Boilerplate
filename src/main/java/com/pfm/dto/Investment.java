package com.pfm.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pfm.dto.Transaction;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Investment
 */
@Validated
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

public class Investment   {
  @JsonProperty("investor_id")
  private String investorId = null;

  @JsonProperty("investment_id")
  private BigDecimal investmentId = null;

  @JsonProperty("initial_investment")
  private BigDecimal initialInvestment = null;

  @JsonProperty("current_investment")
  private BigDecimal currentInvestment = null;

  @JsonProperty("investment_type")
  private String investmentType = null;

  @JsonProperty("investment_details")
  @Valid
  private List<Object> investmentDetails = null;

  @JsonProperty("start_date")
  private LocalDate startDate = null;

  @JsonProperty("end_date")
  private LocalDate endDate = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = null;

  public Investment investorId(String investorId) {
    this.investorId = investorId;
    return this;
  }

  /**
   * Get investorId
   * @return investorId
  **/
  @ApiModelProperty(value = "")


  public String getInvestorId() {
    return investorId;
  }

  public void setInvestorId(String investorId) {
    this.investorId = investorId;
  }

  public Investment investmentId(BigDecimal investmentId) {
    this.investmentId = investmentId;
    return this;
  }

  /**
   * Get investmentId
   * @return investmentId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getInvestmentId() {
    return investmentId;
  }

  public void setInvestmentId(BigDecimal investmentId) {
    this.investmentId = investmentId;
  }

  public Investment initialInvestment(BigDecimal initialInvestment) {
    this.initialInvestment = initialInvestment;
    return this;
  }

  /**
   * Get initialInvestment
   * @return initialInvestment
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getInitialInvestment() {
    return initialInvestment;
  }

  public void setInitialInvestment(BigDecimal initialInvestment) {
    this.initialInvestment = initialInvestment;
  }

  public Investment currentInvestment(BigDecimal currentInvestment) {
    this.currentInvestment = currentInvestment;
    return this;
  }

  /**
   * Get currentInvestment
   * @return currentInvestment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCurrentInvestment() {
    return currentInvestment;
  }

  public void setCurrentInvestment(BigDecimal currentInvestment) {
    this.currentInvestment = currentInvestment;
  }

  public Investment investmentType(String investmentType) {
    this.investmentType = investmentType;
    return this;
  }

  /**
   * Get investmentType
   * @return investmentType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getInvestmentType() {
    return investmentType;
  }

  public void setInvestmentType(String investmentType) {
    this.investmentType = investmentType;
  }

  public Investment investmentDetails(List<Object> investmentDetails) {
    this.investmentDetails = investmentDetails;
    return this;
  }

  public Investment addInvestmentDetailsItem(Object investmentDetailsItem) {
    if (this.investmentDetails == null) {
      this.investmentDetails = new ArrayList<Object>();
    }
    this.investmentDetails.add(investmentDetailsItem);
    return this;
  }

  /**
   * Get investmentDetails
   * @return investmentDetails
  **/
  @ApiModelProperty(value = "")


  public List<Object> getInvestmentDetails() {
    return investmentDetails;
  }

  public void setInvestmentDetails(List<Object> investmentDetails) {
    this.investmentDetails = investmentDetails;
  }

  public Investment startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Investment endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Investment rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public Investment transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Investment addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<Transaction>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Investment investment = (Investment) o;
    return Objects.equals(this.investorId, investment.investorId) &&
        Objects.equals(this.investmentId, investment.investmentId) &&
        Objects.equals(this.initialInvestment, investment.initialInvestment) &&
        Objects.equals(this.currentInvestment, investment.currentInvestment) &&
        Objects.equals(this.investmentType, investment.investmentType) &&
        Objects.equals(this.investmentDetails, investment.investmentDetails) &&
        Objects.equals(this.startDate, investment.startDate) &&
        Objects.equals(this.endDate, investment.endDate) &&
        Objects.equals(this.rate, investment.rate) &&
        Objects.equals(this.transactions, investment.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investorId, investmentId, initialInvestment, currentInvestment, investmentType, investmentDetails, startDate, endDate, rate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Investment {\n");
    
    sb.append("    investorId: ").append(toIndentedString(investorId)).append("\n");
    sb.append("    investmentId: ").append(toIndentedString(investmentId)).append("\n");
    sb.append("    initialInvestment: ").append(toIndentedString(initialInvestment)).append("\n");
    sb.append("    currentInvestment: ").append(toIndentedString(currentInvestment)).append("\n");
    sb.append("    investmentType: ").append(toIndentedString(investmentType)).append("\n");
    sb.append("    investmentDetails: ").append(toIndentedString(investmentDetails)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

