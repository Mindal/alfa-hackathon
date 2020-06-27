package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BankATMStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class BankATMStatus   {
  @JsonProperty("atms")
  @Valid
  private List<ATMStatus> atms = null;

  @JsonProperty("bankLicense")
  private String bankLicense = null;

  public BankATMStatus atms(List<ATMStatus> atms) {
    this.atms = atms;
    return this;
  }

  public BankATMStatus addAtmsItem(ATMStatus atmsItem) {
    if (this.atms == null) {
      this.atms = new ArrayList<ATMStatus>();
    }
    this.atms.add(atmsItem);
    return this;
  }

  /**
   * Список статусов банкоматов
   * @return atms
  **/
  @ApiModelProperty(value = "Список статусов банкоматов")

  @Valid

  public List<ATMStatus> getAtms() {
    return atms;
  }

  public void setAtms(List<ATMStatus> atms) {
    this.atms = atms;
  }

  public BankATMStatus bankLicense(String bankLicense) {
    this.bankLicense = bankLicense;
    return this;
  }

  /**
   * Номер лицензии Альфа-Банка
   * @return bankLicense
  **/
  @ApiModelProperty(value = "Номер лицензии Альфа-Банка")


  public String getBankLicense() {
    return bankLicense;
  }

  public void setBankLicense(String bankLicense) {
    this.bankLicense = bankLicense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankATMStatus bankATMStatus = (BankATMStatus) o;
    return Objects.equals(this.atms, bankATMStatus.atms) &&
        Objects.equals(this.bankLicense, bankATMStatus.bankLicense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atms, bankLicense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankATMStatus {\n");
    
    sb.append("    atms: ").append(toIndentedString(atms)).append("\n");
    sb.append("    bankLicense: ").append(toIndentedString(bankLicense)).append("\n");
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

