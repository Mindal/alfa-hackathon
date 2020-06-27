package ru.alfa.bogdanov.task2.model.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * UserPaymentStats
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T09:22:25.185Z")

public class UserPaymentStats   {
  @JsonProperty("maxAmountCategoryId")
  private Integer maxAmountCategoryId = null;

  @JsonProperty("minAmountCategoryId")
  private Integer minAmountCategoryId = null;

  @JsonProperty("oftenCategoryId")
  private Integer oftenCategoryId = null;

  @JsonProperty("rareCategoryId")
  private Integer rareCategoryId = null;

  public UserPaymentStats maxAmountCategoryId(Integer maxAmountCategoryId) {
    this.maxAmountCategoryId = maxAmountCategoryId;
    return this;
  }

  /**
   * Get maxAmountCategoryId
   * @return maxAmountCategoryId
  **/
  public Integer getMaxAmountCategoryId() {
    return maxAmountCategoryId;
  }

  public void setMaxAmountCategoryId(Integer maxAmountCategoryId) {
    this.maxAmountCategoryId = maxAmountCategoryId;
  }

  public UserPaymentStats minAmountCategoryId(Integer minAmountCategoryId) {
    this.minAmountCategoryId = minAmountCategoryId;
    return this;
  }

  /**
   * Get minAmountCategoryId
   * @return minAmountCategoryId
  **/
  public Integer getMinAmountCategoryId() {
    return minAmountCategoryId;
  }

  public void setMinAmountCategoryId(Integer minAmountCategoryId) {
    this.minAmountCategoryId = minAmountCategoryId;
  }

  public UserPaymentStats oftenCategoryId(Integer oftenCategoryId) {
    this.oftenCategoryId = oftenCategoryId;
    return this;
  }

  /**
   * Get oftenCategoryId
   * @return oftenCategoryId
  **/
  public Integer getOftenCategoryId() {
    return oftenCategoryId;
  }

  public void setOftenCategoryId(Integer oftenCategoryId) {
    this.oftenCategoryId = oftenCategoryId;
  }

  public UserPaymentStats rareCategoryId(Integer rareCategoryId) {
    this.rareCategoryId = rareCategoryId;
    return this;
  }

  /**
   * Get rareCategoryId
   * @return rareCategoryId
  **/
  public Integer getRareCategoryId() {
    return rareCategoryId;
  }

  public void setRareCategoryId(Integer rareCategoryId) {
    this.rareCategoryId = rareCategoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPaymentStats userPaymentStats = (UserPaymentStats) o;
    return Objects.equals(this.maxAmountCategoryId, userPaymentStats.maxAmountCategoryId) &&
        Objects.equals(this.minAmountCategoryId, userPaymentStats.minAmountCategoryId) &&
        Objects.equals(this.oftenCategoryId, userPaymentStats.oftenCategoryId) &&
        Objects.equals(this.rareCategoryId, userPaymentStats.rareCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmountCategoryId, minAmountCategoryId, oftenCategoryId, rareCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPaymentStats {\n");
    
    sb.append("    maxAmountCategoryId: ").append(toIndentedString(maxAmountCategoryId)).append("\n");
    sb.append("    minAmountCategoryId: ").append(toIndentedString(minAmountCategoryId)).append("\n");
    sb.append("    oftenCategoryId: ").append(toIndentedString(oftenCategoryId)).append("\n");
    sb.append("    rareCategoryId: ").append(toIndentedString(rareCategoryId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

