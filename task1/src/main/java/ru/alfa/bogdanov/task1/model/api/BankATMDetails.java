package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BankATMDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class BankATMDetails   {
  @JsonProperty("atms")
  @Valid
  private List<ATMDetails> atms = null;

  @JsonProperty("bankLicense")
  private String bankLicense = null;

  public BankATMDetails atms(List<ATMDetails> atms) {
    this.atms = atms;
    return this;
  }

  public BankATMDetails addAtmsItem(ATMDetails atmsItem) {
    if (this.atms == null) {
      this.atms = new ArrayList<ATMDetails>();
    }
    this.atms.add(atmsItem);
    return this;
  }

  /**
   * Список банкоматов
   * @return atms
  **/
  @Valid

  public List<ATMDetails> getAtms() {
    return atms;
  }

  public void setAtms(List<ATMDetails> atms) {
    this.atms = atms;
  }

  public BankATMDetails bankLicense(String bankLicense) {
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
    BankATMDetails bankATMDetails = (BankATMDetails) o;
    return Objects.equals(this.atms, bankATMDetails.atms) &&
        Objects.equals(this.bankLicense, bankATMDetails.bankLicense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atms, bankLicense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankATMDetails {\n");
    
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

