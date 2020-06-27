package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * SupportInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class SupportInfo   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("other")
  private String other = null;

  @JsonProperty("phone")
  private String phone = null;

  public SupportInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Адрес электронной почты
   * @return email
  **/


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SupportInfo other(String other) {
    this.other = other;
    return this;
  }

  /**
   * Иные контакты поддержки
   * @return other
  **/


  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public SupportInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Телефон
   * @return phone
  **/


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportInfo supportInfo = (SupportInfo) o;
    return Objects.equals(this.email, supportInfo.email) &&
        Objects.equals(this.other, supportInfo.other) &&
        Objects.equals(this.phone, supportInfo.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, other, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

