package org.wso2.carbon.apimgt.rest.api.analytics.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * TopAPIInfoDTO Model.
 */
public class TopAPIInfoDTO   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("publisher")
  private String publisher = null;

  @JsonProperty("context")
  private String context = null;

  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("uriTemplate")
  private String uriTemplate = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("requestCount")
  private Integer requestCount = null;

  @JsonProperty("time")
  private String time = null;

  public TopAPIInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TopAPIInfoDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TopAPIInfoDTO publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @ApiModelProperty(example = "admin", value = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public TopAPIInfoDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "store", value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public TopAPIInfoDTO applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @ApiModelProperty(example = "Test Application", value = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public TopAPIInfoDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public TopAPIInfoDTO uriTemplate(String uriTemplate) {
    this.uriTemplate = uriTemplate;
    return this;
  }

   /**
   * Get uriTemplate
   * @return uriTemplate
  **/
  @ApiModelProperty(example = "/admin/test", value = "")
  public String getUriTemplate() {
    return uriTemplate;
  }

  public void setUriTemplate(String uriTemplate) {
    this.uriTemplate = uriTemplate;
  }

  public TopAPIInfoDTO method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "POST", value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public TopAPIInfoDTO requestCount(Integer requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Get requestCount
   * @return requestCount
  **/
  @ApiModelProperty(example = "15", value = "")
  public Integer getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Integer requestCount) {
    this.requestCount = requestCount;
  }

  public TopAPIInfoDTO time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "2017-08-27T21:52:27.605+0000", value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopAPIInfoDTO topAPIInfo = (TopAPIInfoDTO) o;
    return Objects.equals(this.id, topAPIInfo.id) &&
        Objects.equals(this.version, topAPIInfo.version) &&
        Objects.equals(this.publisher, topAPIInfo.publisher) &&
        Objects.equals(this.context, topAPIInfo.context) &&
        Objects.equals(this.applicationName, topAPIInfo.applicationName) &&
        Objects.equals(this.userId, topAPIInfo.userId) &&
        Objects.equals(this.uriTemplate, topAPIInfo.uriTemplate) &&
        Objects.equals(this.method, topAPIInfo.method) &&
        Objects.equals(this.requestCount, topAPIInfo.requestCount) &&
        Objects.equals(this.time, topAPIInfo.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, publisher, context, applicationName, userId, uriTemplate, method, requestCount, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopAPIInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uriTemplate: ").append(toIndentedString(uriTemplate)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

