package com.pfm.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Investment
 */
@Validated
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-15T20:09:14.699Z")

public class Investment   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("investmentType")
  private String investmentType = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("percentageYield")
  private BigDecimal percentageYield = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public Investment userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

  public Investment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Investment percentageYield(BigDecimal percentageYield) {
    this.percentageYield = percentageYield;
    return this;
  }

  /**
   * Get percentageYield
   * @return percentageYield
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getPercentageYield() {
    return percentageYield;
  }

  public void setPercentageYield(BigDecimal percentageYield) {
    this.percentageYield = percentageYield;
  }

  public Investment date(OffsetDateTime date) {
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

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
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
    return Objects.equals(this.userId, investment.userId) &&
        Objects.equals(this.investmentType, investment.investmentType) &&
        Objects.equals(this.amount, investment.amount) &&
        Objects.equals(this.percentageYield, investment.percentageYield) &&
        Objects.equals(this.date, investment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, investmentType, amount, percentageYield, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Investment {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    investmentType: ").append(toIndentedString(investmentType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentageYield: ").append(toIndentedString(percentageYield)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

