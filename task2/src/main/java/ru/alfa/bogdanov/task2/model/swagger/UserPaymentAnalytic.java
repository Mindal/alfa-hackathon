package ru.alfa.bogdanov.task2.model.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserPaymentAnalytic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T09:22:25.185Z")
public class UserPaymentAnalytic   {
  @JsonProperty("analyticInfo")
  @Valid
  private Map<Integer, PaymentCategoryInfo> analyticInfo = null;

  @JsonProperty("totalSum")
  private BigDecimal totalSum = null;

  @JsonProperty("userId")
  private String userId = null;

  public UserPaymentAnalytic analyticInfo(Map<Integer, PaymentCategoryInfo> analyticInfo) {
    this.analyticInfo = analyticInfo;
    return this;
  }

  public UserPaymentAnalytic putAnalyticInfoItem(Integer key, PaymentCategoryInfo analyticInfoItem) {
    if (this.analyticInfo == null) {
      this.analyticInfo = new HashMap<Integer, PaymentCategoryInfo>();
    }
    this.analyticInfo.put(key, analyticInfoItem);
    return this;
  }

  /**
   * Get analyticInfo
   * @return analyticInfo
  **/
  @Valid

  public Map<Integer, PaymentCategoryInfo> getAnalyticInfo() {
    return analyticInfo;
  }

  public void setAnalyticInfo(Map<Integer, PaymentCategoryInfo> analyticInfo) {
    this.analyticInfo = analyticInfo;
  }

  public UserPaymentAnalytic totalSum(BigDecimal totalSum) {
    this.totalSum = totalSum;
    return this;
  }

  /**
   * Get totalSum
   * @return totalSum
  **/
  @Valid

  public BigDecimal getTotalSum() {
    return totalSum;
  }

  public void setTotalSum(BigDecimal totalSum) {
    this.totalSum = totalSum;
  }

  public UserPaymentAnalytic userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPaymentAnalytic userPaymentAnalytic = (UserPaymentAnalytic) o;
    return Objects.equals(this.analyticInfo, userPaymentAnalytic.analyticInfo) &&
        Objects.equals(this.totalSum, userPaymentAnalytic.totalSum) &&
        Objects.equals(this.userId, userPaymentAnalytic.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticInfo, totalSum, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPaymentAnalytic {\n");
    
    sb.append("    analyticInfo: ").append(toIndentedString(analyticInfo)).append("\n");
    sb.append("    totalSum: ").append(toIndentedString(totalSum)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

