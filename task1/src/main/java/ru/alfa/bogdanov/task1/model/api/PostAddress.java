package ru.alfa.bogdanov.task1.model.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PostAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class PostAddress   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("location")
  private String location = null;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    FIAS("FIAS"),
    
    KLADR("KLADR"),
    
    OTHERDICTIONARY("OtherDictionary"),
    
    HANDMADE("HandMade");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  public PostAddress city(String city) {
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

  public PostAddress location(String location) {
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

  public PostAddress mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  **/


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAddress postAddress = (PostAddress) o;
    return Objects.equals(this.city, postAddress.city) &&
        Objects.equals(this.location, postAddress.location) &&
        Objects.equals(this.mode, postAddress.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, location, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

