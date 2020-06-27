package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Информация по доступности функций АТМ
 */
@ApiModel(description = "Информация по доступности функций АТМ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class ATMStatus   {
  @JsonProperty("availableNow")
  private AvailableNow availableNow = null;

  @JsonProperty("deviceId")
  private Integer deviceId = null;

  @JsonProperty("recordUpdated")
  private OffsetDateTime recordUpdated = null;

  public ATMStatus availableNow(AvailableNow availableNow) {
    this.availableNow = availableNow;
    return this;
  }

  /**
   * Работоспособность АТМ по данным поставщика информации на момент выполнения запроса
   * @return availableNow
  **/
  @ApiModelProperty(value = "Работоспособность АТМ по данным поставщика информации на момент выполнения запроса")

  @Valid

  public AvailableNow getAvailableNow() {
    return availableNow;
  }

  public void setAvailableNow(AvailableNow availableNow) {
    this.availableNow = availableNow;
  }

  public ATMStatus deviceId(Integer deviceId) {
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

  public ATMStatus recordUpdated(OffsetDateTime recordUpdated) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATMStatus atMStatus = (ATMStatus) o;
    return Objects.equals(this.availableNow, atMStatus.availableNow) &&
        Objects.equals(this.deviceId, atMStatus.deviceId) &&
        Objects.equals(this.recordUpdated, atMStatus.recordUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableNow, deviceId, recordUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMStatus {\n");
    
    sb.append("    availableNow: ").append(toIndentedString(availableNow)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    recordUpdated: ").append(toIndentedString(recordUpdated)).append("\n");
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

