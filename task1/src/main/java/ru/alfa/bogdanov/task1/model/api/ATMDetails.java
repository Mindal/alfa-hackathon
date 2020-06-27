package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Статическая и редкоменяющаяся информация о банкомате
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class ATMDetails   {
  @JsonProperty("address")
  private PostAddress address = null;

  @JsonProperty("addressComments")
  private String addressComments = null;

  @JsonProperty("availablePaymentSystems")
  @Valid
  private List<String> availablePaymentSystems = null;

  @JsonProperty("cashInCurrencies")
  @Valid
  private List<String> cashInCurrencies = null;

  @JsonProperty("cashOutCurrencies")
  @Valid
  private List<String> cashOutCurrencies = null;

  @JsonProperty("coordinates")
  private Coordinates coordinates = null;

  @JsonProperty("deviceId")
  private Integer deviceId = null;

  @JsonProperty("nfc")
  private String nfc = null;

  @JsonProperty("publicAccess")
  private String publicAccess = null;

  @JsonProperty("recordUpdated")
  private OffsetDateTime recordUpdated = null;

  @JsonProperty("services")
  private ATMServices services = null;

  @JsonProperty("supportInfo")
  private SupportInfo supportInfo = null;

  @JsonProperty("timeAccess")
  private ATMAccess timeAccess = null;

  @JsonProperty("timeShift")
  private Integer timeShift = null;

  public ATMDetails address(PostAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Почтовый адрес АТМ
   * @return address
  **/
  @ApiModelProperty(value = "Почтовый адрес АТМ")

  @Valid

  public PostAddress getAddress() {
    return address;
  }

  public void setAddress(PostAddress address) {
    this.address = address;
  }

  public ATMDetails addressComments(String addressComments) {
    this.addressComments = addressComments;
    return this;
  }

  /**
   * Вспомогательный текстовый комментарий, помогающий пользователю найти АТМ. Например, «справа от входа в торговый комплекс с улицы Кораблестроителей»
   * @return addressComments
  **/
  @ApiModelProperty(value = "Вспомогательный текстовый комментарий, помогающий пользователю найти АТМ. Например, «справа от входа в торговый комплекс с улицы Кораблестроителей»")


  public String getAddressComments() {
    return addressComments;
  }

  public void setAddressComments(String addressComments) {
    this.addressComments = addressComments;
  }

  public ATMDetails availablePaymentSystems(List<String> availablePaymentSystems) {
    this.availablePaymentSystems = availablePaymentSystems;
    return this;
  }

  public ATMDetails addAvailablePaymentSystemsItem(String availablePaymentSystemsItem) {
    if (this.availablePaymentSystems == null) {
      this.availablePaymentSystems = new ArrayList<String>();
    }
    this.availablePaymentSystems.add(availablePaymentSystemsItem);
    return this;
  }

  /**
   * Get availablePaymentSystems
   * @return availablePaymentSystems
  **/
  @ApiModelProperty(value = "")


  public List<String> getAvailablePaymentSystems() {
    return availablePaymentSystems;
  }

  public void setAvailablePaymentSystems(List<String> availablePaymentSystems) {
    this.availablePaymentSystems = availablePaymentSystems;
  }

  public ATMDetails cashInCurrencies(List<String> cashInCurrencies) {
    this.cashInCurrencies = cashInCurrencies;
    return this;
  }

  public ATMDetails addCashInCurrenciesItem(String cashInCurrenciesItem) {
    if (this.cashInCurrencies == null) {
      this.cashInCurrencies = new ArrayList<String>();
    }
    this.cashInCurrencies.add(cashInCurrenciesItem);
    return this;
  }

  /**
   * Список кодов валют по общероссийскому классификатору, которые АТМ поддерживает для внесения
   * @return cashInCurrencies
  **/
  @ApiModelProperty(value = "Список кодов валют по общероссийскому классификатору, которые АТМ поддерживает для внесения")


  public List<String> getCashInCurrencies() {
    return cashInCurrencies;
  }

  public void setCashInCurrencies(List<String> cashInCurrencies) {
    this.cashInCurrencies = cashInCurrencies;
  }

  public ATMDetails cashOutCurrencies(List<String> cashOutCurrencies) {
    this.cashOutCurrencies = cashOutCurrencies;
    return this;
  }

  public ATMDetails addCashOutCurrenciesItem(String cashOutCurrenciesItem) {
    if (this.cashOutCurrencies == null) {
      this.cashOutCurrencies = new ArrayList<String>();
    }
    this.cashOutCurrencies.add(cashOutCurrenciesItem);
    return this;
  }

  /**
   * Список кодов валют по общероссийскому классификатору, которые АТМ поддерживает для выдачи
   * @return cashOutCurrencies
  **/
  @ApiModelProperty(value = "Список кодов валют по общероссийскому классификатору, которые АТМ поддерживает для выдачи")


  public List<String> getCashOutCurrencies() {
    return cashOutCurrencies;
  }

  public void setCashOutCurrencies(List<String> cashOutCurrencies) {
    this.cashOutCurrencies = cashOutCurrencies;
  }

  public ATMDetails coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Широта и долгота места установки АТМ
   * @return coordinates
  **/
  @ApiModelProperty(value = "Широта и долгота места установки АТМ")

  @Valid

  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public ATMDetails deviceId(Integer deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Номер Terminal-ID, присвоенный АТМ в процессинге Банка и передаваемый в информационном обмене между эквайрером, платежной системой и эмитентом.  Значение соответствует ISO-8583 полю 41 (Card Acceptor Terminal Identification)
   * @return deviceId
  **/
  @ApiModelProperty(value = "Номер Terminal-ID, присвоенный АТМ в процессинге Банка и передаваемый в информационном обмене между эквайрером, платежной системой и эмитентом.  Значение соответствует ISO-8583 полю 41 (Card Acceptor Terminal Identification)")


  public Integer getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  public ATMDetails nfc(String nfc) {
    this.nfc = nfc;
    return this;
  }

  /**
   * Get nfc
   * @return nfc
  **/
  @ApiModelProperty(value = "")


  public String getNfc() {
    return nfc;
  }

  public void setNfc(String nfc) {
    this.nfc = nfc;
  }

  public ATMDetails publicAccess(String publicAccess) {
    this.publicAccess = publicAccess;
    return this;
  }

  /**
   * Доступ к АТМ. Значения: 1 = в помещении кредитной организации в открытом доступе  2 = в помещении кредитной организации в ограниченном доступе  3 = вне помещения кредитной организации в открытом доступе  4 = вне помещения кредитной организации в ограниченном доступе  (значения соответствуют правилам заполнения Ф-250 ЦБ РФ1)  
   * @return publicAccess
  **/
  @ApiModelProperty(value = "Доступ к АТМ. Значения: 1 = в помещении кредитной организации в открытом доступе  2 = в помещении кредитной организации в ограниченном доступе  3 = вне помещения кредитной организации в открытом доступе  4 = вне помещения кредитной организации в ограниченном доступе  (значения соответствуют правилам заполнения Ф-250 ЦБ РФ1)  ")


  public String getPublicAccess() {
    return publicAccess;
  }

  public void setPublicAccess(String publicAccess) {
    this.publicAccess = publicAccess;
  }

  public ATMDetails recordUpdated(OffsetDateTime recordUpdated) {
    this.recordUpdated = recordUpdated;
    return this;
  }

  /**
   * Дата/время получения последней информации из master-системы
   * @return recordUpdated
  **/
  @ApiModelProperty(value = "Дата/время получения последней информации из master-системы")

  @Valid

  public OffsetDateTime getRecordUpdated() {
    return recordUpdated;
  }

  public void setRecordUpdated(OffsetDateTime recordUpdated) {
    this.recordUpdated = recordUpdated;
  }

  public ATMDetails services(ATMServices services) {
    this.services = services;
    return this;
  }

  /**
   * Функции, которыми обладает данный АТМ (значения соответствуют Ф-250 ЦБ РФ)
   * @return services
  **/
  @ApiModelProperty(value = "Функции, которыми обладает данный АТМ (значения соответствуют Ф-250 ЦБ РФ)")

  @Valid

  public ATMServices getServices() {
    return services;
  }

  public void setServices(ATMServices services) {
    this.services = services;
  }

  public ATMDetails supportInfo(SupportInfo supportInfo) {
    this.supportInfo = supportInfo;
    return this;
  }

  /**
   * Информация о службе поддержке
   * @return supportInfo
  **/
  @ApiModelProperty(value = "Информация о службе поддержке")

  @Valid

  public SupportInfo getSupportInfo() {
    return supportInfo;
  }

  public void setSupportInfo(SupportInfo supportInfo) {
    this.supportInfo = supportInfo;
  }

  public ATMDetails timeAccess(ATMAccess timeAccess) {
    this.timeAccess = timeAccess;
    return this;
  }

  /**
   * Режим работы ATM
   * @return timeAccess
  **/
  @ApiModelProperty(value = "Режим работы ATM")

  @Valid

  public ATMAccess getTimeAccess() {
    return timeAccess;
  }

  public void setTimeAccess(ATMAccess timeAccess) {
    this.timeAccess = timeAccess;
  }

  public ATMDetails timeShift(Integer timeShift) {
    this.timeShift = timeShift;
    return this;
  }

  /**
   * Сдвиг времени региона установки конкретного АТМ, относительно UTC. Например, 3
   * @return timeShift
  **/
  @ApiModelProperty(value = "Сдвиг времени региона установки конкретного АТМ, относительно UTC. Например, 3")


  public Integer getTimeShift() {
    return timeShift;
  }

  public void setTimeShift(Integer timeShift) {
    this.timeShift = timeShift;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATMDetails atMDetails = (ATMDetails) o;
    return Objects.equals(this.address, atMDetails.address) &&
        Objects.equals(this.addressComments, atMDetails.addressComments) &&
        Objects.equals(this.availablePaymentSystems, atMDetails.availablePaymentSystems) &&
        Objects.equals(this.cashInCurrencies, atMDetails.cashInCurrencies) &&
        Objects.equals(this.cashOutCurrencies, atMDetails.cashOutCurrencies) &&
        Objects.equals(this.coordinates, atMDetails.coordinates) &&
        Objects.equals(this.deviceId, atMDetails.deviceId) &&
        Objects.equals(this.nfc, atMDetails.nfc) &&
        Objects.equals(this.publicAccess, atMDetails.publicAccess) &&
        Objects.equals(this.recordUpdated, atMDetails.recordUpdated) &&
        Objects.equals(this.services, atMDetails.services) &&
        Objects.equals(this.supportInfo, atMDetails.supportInfo) &&
        Objects.equals(this.timeAccess, atMDetails.timeAccess) &&
        Objects.equals(this.timeShift, atMDetails.timeShift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressComments, availablePaymentSystems, cashInCurrencies, cashOutCurrencies, coordinates, deviceId, nfc, publicAccess, recordUpdated, services, supportInfo, timeAccess, timeShift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMDetails {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressComments: ").append(toIndentedString(addressComments)).append("\n");
    sb.append("    availablePaymentSystems: ").append(toIndentedString(availablePaymentSystems)).append("\n");
    sb.append("    cashInCurrencies: ").append(toIndentedString(cashInCurrencies)).append("\n");
    sb.append("    cashOutCurrencies: ").append(toIndentedString(cashOutCurrencies)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    nfc: ").append(toIndentedString(nfc)).append("\n");
    sb.append("    publicAccess: ").append(toIndentedString(publicAccess)).append("\n");
    sb.append("    recordUpdated: ").append(toIndentedString(recordUpdated)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    supportInfo: ").append(toIndentedString(supportInfo)).append("\n");
    sb.append("    timeAccess: ").append(toIndentedString(timeAccess)).append("\n");
    sb.append("    timeShift: ").append(toIndentedString(timeShift)).append("\n");
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

