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
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xpanse.modules.deployment.deployers.opentofu.opentofumaker.generated.model.OpenTofuScriptGitRepoDetails;
import org.eclipse.xpanse.modules.deployment.deployers.opentofu.opentofumaker.generated.model.WebhookConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OpenTofuAsyncDeployFromGitRepoRequest
 */
@JsonPropertyOrder({
  OpenTofuAsyncDeployFromGitRepoRequest.JSON_PROPERTY_IS_PLAN_ONLY,
  OpenTofuAsyncDeployFromGitRepoRequest.JSON_PROPERTY_VARIABLES,
  OpenTofuAsyncDeployFromGitRepoRequest.JSON_PROPERTY_ENV_VARIABLES,
  OpenTofuAsyncDeployFromGitRepoRequest.JSON_PROPERTY_GIT_REPO_DETAILS,
  OpenTofuAsyncDeployFromGitRepoRequest.JSON_PROPERTY_WEBHOOK_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenTofuAsyncDeployFromGitRepoRequest {
  public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
  private Boolean isPlanOnly;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, Object> variables = new HashMap<>();

  public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
  private Map<String, String> envVariables = new HashMap<>();

  public static final String JSON_PROPERTY_GIT_REPO_DETAILS = "gitRepoDetails";
  private OpenTofuScriptGitRepoDetails gitRepoDetails;

  public static final String JSON_PROPERTY_WEBHOOK_CONFIG = "webhookConfig";
  private WebhookConfig webhookConfig;

  public OpenTofuAsyncDeployFromGitRepoRequest() {
  }

  public OpenTofuAsyncDeployFromGitRepoRequest isPlanOnly(Boolean isPlanOnly) {
    
    this.isPlanOnly = isPlanOnly;
    return this;
  }

   /**
   * Flag to control if the deployment must only generate the OpenTofu or it must also apply the changes.
   * @return isPlanOnly
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPlanOnly() {
    return isPlanOnly;
  }


  @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPlanOnly(Boolean isPlanOnly) {
    this.isPlanOnly = isPlanOnly;
  }


  public OpenTofuAsyncDeployFromGitRepoRequest variables(Map<String, Object> variables) {
    
    this.variables = variables;
    return this;
  }

  public OpenTofuAsyncDeployFromGitRepoRequest putVariablesItem(String key, Object variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Key-value pairs of variables that must be used to execute the OpenTofu request.
   * @return variables
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getVariables() {
    return variables;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVariables(Map<String, Object> variables) {
    this.variables = variables;
  }


  public OpenTofuAsyncDeployFromGitRepoRequest envVariables(Map<String, String> envVariables) {
    
    this.envVariables = envVariables;
    return this;
  }

  public OpenTofuAsyncDeployFromGitRepoRequest putEnvVariablesItem(String key, String envVariablesItem) {
    if (this.envVariables == null) {
      this.envVariables = new HashMap<>();
    }
    this.envVariables.put(key, envVariablesItem);
    return this;
  }

   /**
   * Key-value pairs of variables that must be injected as environment variables to OpenTofu process.
   * @return envVariables
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getEnvVariables() {
    return envVariables;
  }


  @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvVariables(Map<String, String> envVariables) {
    this.envVariables = envVariables;
  }


  public OpenTofuAsyncDeployFromGitRepoRequest gitRepoDetails(OpenTofuScriptGitRepoDetails gitRepoDetails) {
    
    this.gitRepoDetails = gitRepoDetails;
    return this;
  }

   /**
   * Get gitRepoDetails
   * @return gitRepoDetails
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpenTofuScriptGitRepoDetails getGitRepoDetails() {
    return gitRepoDetails;
  }


  @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGitRepoDetails(OpenTofuScriptGitRepoDetails gitRepoDetails) {
    this.gitRepoDetails = gitRepoDetails;
  }


  public OpenTofuAsyncDeployFromGitRepoRequest webhookConfig(WebhookConfig webhookConfig) {
    
    this.webhookConfig = webhookConfig;
    return this;
  }

   /**
   * Get webhookConfig
   * @return webhookConfig
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WebhookConfig getWebhookConfig() {
    return webhookConfig;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookConfig(WebhookConfig webhookConfig) {
    this.webhookConfig = webhookConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenTofuAsyncDeployFromGitRepoRequest openTofuAsyncDeployFromGitRepoRequest = (OpenTofuAsyncDeployFromGitRepoRequest) o;
    return Objects.equals(this.isPlanOnly, openTofuAsyncDeployFromGitRepoRequest.isPlanOnly) &&
        Objects.equals(this.variables, openTofuAsyncDeployFromGitRepoRequest.variables) &&
        Objects.equals(this.envVariables, openTofuAsyncDeployFromGitRepoRequest.envVariables) &&
        Objects.equals(this.gitRepoDetails, openTofuAsyncDeployFromGitRepoRequest.gitRepoDetails) &&
        Objects.equals(this.webhookConfig, openTofuAsyncDeployFromGitRepoRequest.webhookConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPlanOnly, variables, envVariables, gitRepoDetails, webhookConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTofuAsyncDeployFromGitRepoRequest {\n");
    sb.append("    isPlanOnly: ").append(toIndentedString(isPlanOnly)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    gitRepoDetails: ").append(toIndentedString(gitRepoDetails)).append("\n");
    sb.append("    webhookConfig: ").append(toIndentedString(webhookConfig)).append("\n");
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

