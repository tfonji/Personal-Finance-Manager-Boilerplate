package com.pfm.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pfm.dto.Portfolio;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Investor
 */
@Validated
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

public class Investor   {
  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("portfolio")
  @Valid
  private List<Portfolio> portfolio = null;

  public Investor firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Investor lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Investor portfolio(List<Portfolio> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public Investor addPortfolioItem(Portfolio portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<Portfolio>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }

  /**
   * Get portfolio
   * @return portfolio
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Portfolio> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<Portfolio> portfolio) {
    this.portfolio = portfolio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Investor investor = (Investor) o;
    return Objects.equals(this.firstName, investor.firstName) &&
        Objects.equals(this.lastName, investor.lastName) &&
        Objects.equals(this.portfolio, investor.portfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, portfolio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Investor {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
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

