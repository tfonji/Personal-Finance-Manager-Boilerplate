package com.pfm.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pfm.dto.Investment;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Portfolio
 */
@Validated
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

public class Portfolio   {
  @JsonProperty("investor_id")
  private String investorId = null;

  @JsonProperty("investments")
  @Valid
  private List<Investment> investments = null;

  public Portfolio investorId(String investorId) {
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

  public Portfolio investments(List<Investment> investments) {
    this.investments = investments;
    return this;
  }

  public Portfolio addInvestmentsItem(Investment investmentsItem) {
    if (this.investments == null) {
      this.investments = new ArrayList<Investment>();
    }
    this.investments.add(investmentsItem);
    return this;
  }

  /**
   * Get investments
   * @return investments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Investment> getInvestments() {
    return investments;
  }

  public void setInvestments(List<Investment> investments) {
    this.investments = investments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portfolio portfolio = (Portfolio) o;
    return Objects.equals(this.investorId, portfolio.investorId) &&
        Objects.equals(this.investments, portfolio.investments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investorId, investments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portfolio {\n");
    
    sb.append("    investorId: ").append(toIndentedString(investorId)).append("\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
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

