/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.opentofu.opentofumaker.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OpenTofuMakerSystemStatus
 */
@JsonPropertyOrder({
  OpenTofuMakerSystemStatus.JSON_PROPERTY_HEALTH_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenTofuMakerSystemStatus {
  /**
   * The health status of api service.
   */
  public enum HealthStatusEnum {
    OK("OK"),
    
    NOK("NOK");

    private String value;

    HealthStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HealthStatusEnum fromValue(String value) {
      for (HealthStatusEnum b : HealthStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HEALTH_STATUS = "healthStatus";
  private HealthStatusEnum healthStatus;

  public OpenTofuMakerSystemStatus() {
  }

  public OpenTofuMakerSystemStatus healthStatus(HealthStatusEnum healthStatus) {
    
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * The health status of api service.
   * @return healthStatus
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HealthStatusEnum getHealthStatus() {
    return healthStatus;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHealthStatus(HealthStatusEnum healthStatus) {
    this.healthStatus = healthStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenTofuMakerSystemStatus openTofuMakerSystemStatus = (OpenTofuMakerSystemStatus) o;
    return Objects.equals(this.healthStatus, openTofuMakerSystemStatus.healthStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTofuMakerSystemStatus {\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
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

