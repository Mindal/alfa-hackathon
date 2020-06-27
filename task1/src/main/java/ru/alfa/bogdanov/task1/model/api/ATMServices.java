package ru.alfa.bogdanov.task1.model.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ATMServices
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class ATMServices   {
  @JsonProperty("cardCashIn")
  private String cardCashIn = null;

  @JsonProperty("cardCashOut")
  private String cardCashOut = null;

  @JsonProperty("cardPayments")
  private String cardPayments = null;

  @JsonProperty("cashIn")
  private String cashIn = null;

  @JsonProperty("cashOut")
  private String cashOut = null;

  @JsonProperty("payments")
  private String payments = null;

  public ATMServices cardCashIn(String cardCashIn) {
    this.cardCashIn = cardCashIn;
    return this;
  }

  /**
   * Операции внесения наличных денежных средств с использованием платежных карт и их реквизитов
   * @return cardCashIn
  **/
  @ApiModelProperty(value = "Операции внесения наличных денежных средств с использованием платежных карт и их реквизитов")


  public String getCardCashIn() {
    return cardCashIn;
  }

  public void setCardCashIn(String cardCashIn) {
    this.cardCashIn = cardCashIn;
  }

  public ATMServices cardCashOut(String cardCashOut) {
    this.cardCashOut = cardCashOut;
    return this;
  }

  /**
   * Операция выдачи наличных с использованием платежных карт и их реквизитов
   * @return cardCashOut
  **/
  @ApiModelProperty(value = "Операция выдачи наличных с использованием платежных карт и их реквизитов")


  public String getCardCashOut() {
    return cardCashOut;
  }

  public void setCardCashOut(String cardCashOut) {
    this.cardCashOut = cardCashOut;
  }

  public ATMServices cardPayments(String cardPayments) {
    this.cardPayments = cardPayments;
    return this;
  }

  /**
   * Платежи (оплата товаров и услуг) в пользу поставщиков услуг и третьих лиц с использованием платежных карт и их реквизитов
   * @return cardPayments
  **/
  @ApiModelProperty(value = "Платежи (оплата товаров и услуг) в пользу поставщиков услуг и третьих лиц с использованием платежных карт и их реквизитов")


  public String getCardPayments() {
    return cardPayments;
  }

  public void setCardPayments(String cardPayments) {
    this.cardPayments = cardPayments;
  }

  public ATMServices cashIn(String cashIn) {
    this.cashIn = cashIn;
    return this;
  }

  /**
   * Операции внесения наличных денежных средств БЕЗ использования платежных карт и их реквизитов
   * @return cashIn
  **/
  @ApiModelProperty(value = "Операции внесения наличных денежных средств БЕЗ использования платежных карт и их реквизитов")


  public String getCashIn() {
    return cashIn;
  }

  public void setCashIn(String cashIn) {
    this.cashIn = cashIn;
  }

  public ATMServices cashOut(String cashOut) {
    this.cashOut = cashOut;
    return this;
  }

  /**
   * Операция выдачи наличных БЕЗ использования платежных карт и их реквизитов
   * @return cashOut
  **/
  @ApiModelProperty(value = "Операция выдачи наличных БЕЗ использования платежных карт и их реквизитов")


  public String getCashOut() {
    return cashOut;
  }

  public void setCashOut(String cashOut) {
    this.cashOut = cashOut;
  }

  public ATMServices payments(String payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Платежи (Оплата товаров и услуг) в пользу поставщиков услуг и третьих лиц БЕЗ использования платежных карт и их реквизитов
   * @return payments
  **/
  @ApiModelProperty(value = "Платежи (Оплата товаров и услуг) в пользу поставщиков услуг и третьих лиц БЕЗ использования платежных карт и их реквизитов")


  public String getPayments() {
    return payments;
  }

  public void setPayments(String payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATMServices atMServices = (ATMServices) o;
    return Objects.equals(this.cardCashIn, atMServices.cardCashIn) &&
        Objects.equals(this.cardCashOut, atMServices.cardCashOut) &&
        Objects.equals(this.cardPayments, atMServices.cardPayments) &&
        Objects.equals(this.cashIn, atMServices.cashIn) &&
        Objects.equals(this.cashOut, atMServices.cashOut) &&
        Objects.equals(this.payments, atMServices.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCashIn, cardCashOut, cardPayments, cashIn, cashOut, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMServices {\n");
    
    sb.append("    cardCashIn: ").append(toIndentedString(cardCashIn)).append("\n");
    sb.append("    cardCashOut: ").append(toIndentedString(cardCashOut)).append("\n");
    sb.append("    cardPayments: ").append(toIndentedString(cardPayments)).append("\n");
    sb.append("    cashIn: ").append(toIndentedString(cashIn)).append("\n");
    sb.append("    cashOut: ").append(toIndentedString(cashOut)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

