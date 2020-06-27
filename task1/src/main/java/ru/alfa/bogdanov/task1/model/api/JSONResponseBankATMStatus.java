package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * JSONResponseBankATMStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class JSONResponseBankATMStatus   {
  @JsonProperty("data")
  private BankATMStatus data = null;

  @JsonProperty("error")
  private java.lang.Error error = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("total")
  private Integer total = null;

  public JSONResponseBankATMStatus data(BankATMStatus data) {
    this.data = data;
    return this;
  }

  /**
   * Данные
   * @return data
  **/
  @ApiModelProperty(value = "Данные")

  @Valid

  public BankATMStatus getData() {
    return data;
  }

  public void setData(BankATMStatus data) {
    this.data = data;
  }

  public JSONResponseBankATMStatus error(java.lang.Error error) {
    this.error = error;
    return this;
  }

  /**
   * Информация об ошибке в слчуае если success = false
   * @return error
  **/
  @ApiModelProperty(value = "Информация об ошибке в слчуае если success = false")

  @Valid

  public java.lang.Error getError() {
    return error;
  }

  public void setError(java.lang.Error error) {
    this.error = error;
  }

  public JSONResponseBankATMStatus success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Успешность выполнения запроса
   * @return success
  **/
  @ApiModelProperty(example = "false", value = "Успешность выполнения запроса")


  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public JSONResponseBankATMStatus total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Общее количество элементов в списке, если в атрибуте data передается список
   * @return total
  **/
  @ApiModelProperty(value = "Общее количество элементов в списке, если в атрибуте data передается список")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONResponseBankATMStatus jsONResponseBankATMStatus = (JSONResponseBankATMStatus) o;
    return Objects.equals(this.data, jsONResponseBankATMStatus.data) &&
        Objects.equals(this.error, jsONResponseBankATMStatus.error) &&
        Objects.equals(this.success, jsONResponseBankATMStatus.success) &&
        Objects.equals(this.total, jsONResponseBankATMStatus.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, error, success, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONResponseBankATMStatus {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

