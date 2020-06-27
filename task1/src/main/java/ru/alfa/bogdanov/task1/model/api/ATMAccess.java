package ru.alfa.bogdanov.task1.model.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ATMAccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-27T13:21:13.360Z")

public class ATMAccess   {
  /**
   * Доступность АТМ для клиента, принимает следующие значения:  alltime = круглосуточно  schedule = по расписанию работы организации. В этом случае расписание указывается в поле schedule.
   */
  public enum ModeEnum {
    ALLTIME("alltime"),
    
    SCHEDULE("schedule"),
    
    NOINFO("noinfo");

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

  @JsonProperty("schedule")
  private String schedule = null;

  public ATMAccess mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Доступность АТМ для клиента, принимает следующие значения:  alltime = круглосуточно  schedule = по расписанию работы организации. В этом случае расписание указывается в поле schedule.
   * @return mode
  **/


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public ATMAccess schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Указывается, если mode=schedule. Массив [DD:hhmm–hhmm,DD:hhmm–hhmm,DD:hhmm–hhmm,…] DD = [MO, TU, WE, TH, FR, SA, SU] hh = 00..24 mm = 00..59 Время указывается местное (места установки АТМ) Если в течение дня есть перерыв, то указывается каждый диапазон времени в течение одного дня. Например, MO:0800-1300,MO:1400-2100,TU:0800-1300,TU:1400-2100
   * @return schedule
  **/


  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATMAccess atMAccess = (ATMAccess) o;
    return Objects.equals(this.mode, atMAccess.mode) &&
        Objects.equals(this.schedule, atMAccess.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMAccess {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

