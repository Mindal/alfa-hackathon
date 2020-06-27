package ru.alfa.bogdanov.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AtmResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:06:39.963Z")

public class AtmResponse   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("deviceId")
  private Integer deviceId = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("payments")
  private Boolean payments = null;

  public AtmResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AtmResponse deviceId(Integer deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
  **/


  public Integer getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  public AtmResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  **/


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public AtmResponse location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AtmResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  **/


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public AtmResponse payments(Boolean payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  **/


  public Boolean isPayments() {
    return payments;
  }

  public void setPayments(Boolean payments) {
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
    AtmResponse atmResponse = (AtmResponse) o;
    return Objects.equals(this.city, atmResponse.city) &&
        Objects.equals(this.deviceId, atmResponse.deviceId) &&
        Objects.equals(this.latitude, atmResponse.latitude) &&
        Objects.equals(this.location, atmResponse.location) &&
        Objects.equals(this.longitude, atmResponse.longitude) &&
        Objects.equals(this.payments, atmResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, deviceId, latitude, location, longitude, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtmResponse {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

