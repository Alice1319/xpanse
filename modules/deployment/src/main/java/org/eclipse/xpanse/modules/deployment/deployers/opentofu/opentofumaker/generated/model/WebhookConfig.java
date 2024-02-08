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
 * Configuration information of webhook.
 */
@JsonPropertyOrder({
  WebhookConfig.JSON_PROPERTY_URL,
  WebhookConfig.JSON_PROPERTY_AUTH_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookConfig {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * The permission type when calling back.
   */
  public enum AuthTypeEnum {
    NONE("NONE"),
    
    OAUTH2("OAUTH2");

    private String value;

    AuthTypeEnum(String value) {
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
    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private AuthTypeEnum authType;

  public WebhookConfig() {
  }

  public WebhookConfig url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Callback address after deployment/destroy is completed.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookConfig authType(AuthTypeEnum authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * The permission type when calling back.
   * @return authType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConfig webhookConfig = (WebhookConfig) o;
    return Objects.equals(this.url, webhookConfig.url) &&
        Objects.equals(this.authType, webhookConfig.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConfig {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

