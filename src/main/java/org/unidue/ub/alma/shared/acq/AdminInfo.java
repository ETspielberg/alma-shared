/*
 * Ex Libris APIs
 * For more information on how to use these APIs, including how to create an API key required for authentication, see [Alma REST APIs](https://developers.exlibrisgroup.com/alma/apis).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.unidue.ub.alma.shared.acq;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Administrative details about the interface.
 */
@ApiModel(description = "Administrative details about the interface.")
@JsonPropertyOrder({
  AdminInfo.JSON_PROPERTY_USER_ID,
  AdminInfo.JSON_PROPERTY_USER_PASSWORD,
  AdminInfo.JSON_PROPERTY_USER_PASSWORD_NOTE,
  AdminInfo.JSON_PROPERTY_ONLINE_ADMIN_MODULE,
  AdminInfo.JSON_PROPERTY_ADMIN_URI,
  AdminInfo.JSON_PROPERTY_ADMIN_URI_TYPE,
  AdminInfo.JSON_PROPERTY_OPEN_URL_COMPLIANT,
  AdminInfo.JSON_PROPERTY_LINKING_NOTE,
  AdminInfo.JSON_PROPERTY_HARDWARE_REQ_INTERNAL,
  AdminInfo.JSON_PROPERTY_HARDWARE_REQ_PUBLIC,
  AdminInfo.JSON_PROPERTY_SOFTWARE_REQ_INTERNAL,
  AdminInfo.JSON_PROPERTY_SOFTWARE_REQ_PUBLIC,
  AdminInfo.JSON_PROPERTY_MAINTENANCE_WIN_VALUE,
  AdminInfo.JSON_PROPERTY_INCIDENT_LOG,
  AdminInfo.JSON_PROPERTY_ADMIN_DOCUMENTATION
})

@XmlRootElement(name = "admin_info")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "admin_info")
public class AdminInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @XmlElement(name = "user_id")
  private String userId;

  public static final String JSON_PROPERTY_USER_PASSWORD = "user_password";
  @XmlElement(name = "user_password")
  private String userPassword;

  public static final String JSON_PROPERTY_USER_PASSWORD_NOTE = "user_password_note";
  @XmlElement(name = "user_password_note")
  private String userPasswordNote;

  public static final String JSON_PROPERTY_ONLINE_ADMIN_MODULE = "online_admin_module";
  @XmlElement(name = "online_admin_module")
  private Boolean onlineAdminModule;

  public static final String JSON_PROPERTY_ADMIN_URI = "admin_uri";
  @XmlElement(name = "admin_uri")
  private String adminUri;

  public static final String JSON_PROPERTY_ADMIN_URI_TYPE = "admin_uri_type";
  @XmlElement(name = "admin_uri_type")
  private AdminInfoAdminUriType adminUriType;

  public static final String JSON_PROPERTY_OPEN_URL_COMPLIANT = "open_url_compliant";
  @XmlElement(name = "open_url_compliant")
  private Boolean openUrlCompliant;

  public static final String JSON_PROPERTY_LINKING_NOTE = "linking_note";
  @XmlElement(name = "linking_note")
  private String linkingNote;

  public static final String JSON_PROPERTY_HARDWARE_REQ_INTERNAL = "hardware_req_internal";
  @XmlElement(name = "hardware_req_internal")
  private String hardwareReqInternal;

  public static final String JSON_PROPERTY_HARDWARE_REQ_PUBLIC = "hardware_req_public";
  @XmlElement(name = "hardware_req_public")
  private String hardwareReqPublic;

  public static final String JSON_PROPERTY_SOFTWARE_REQ_INTERNAL = "software_req_internal";
  @XmlElement(name = "software_req_internal")
  private String softwareReqInternal;

  public static final String JSON_PROPERTY_SOFTWARE_REQ_PUBLIC = "software_req_public";
  @XmlElement(name = "software_req_public")
  private String softwareReqPublic;

  public static final String JSON_PROPERTY_MAINTENANCE_WIN_VALUE = "maintenance_win_value";
  @XmlElement(name = "maintenance_win_value")
  private String maintenanceWinValue;

  public static final String JSON_PROPERTY_INCIDENT_LOG = "incident_log";
  @XmlElement(name = "incident_log")
  private String incidentLog;

  public static final String JSON_PROPERTY_ADMIN_DOCUMENTATION = "admin_documentation";
  @XmlElement(name = "admin_documentation")
  private String adminDocumentation;


  public AdminInfo userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user id for security purposes.
   * @return userId
  **/

  @ApiModelProperty(value = "The user id for security purposes.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "user_id")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AdminInfo userPassword(String userPassword) {
    
    this.userPassword = userPassword;
    return this;
  }

   /**
   * The user password for security purposes.
   * @return userPassword
  **/

  @ApiModelProperty(value = "The user password for security purposes.")
  @JsonProperty(JSON_PROPERTY_USER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "user_password")

  public String getUserPassword() {
    return userPassword;
  }


  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public AdminInfo userPasswordNote(String userPasswordNote) {
    
    this.userPasswordNote = userPasswordNote;
    return this;
  }

   /**
   * The user password&#39;s related note.
   * @return userPasswordNote
  **/

  @ApiModelProperty(value = "The user password's related note.")
  @JsonProperty(JSON_PROPERTY_USER_PASSWORD_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "user_password_note")

  public String getUserPasswordNote() {
    return userPasswordNote;
  }


  public void setUserPasswordNote(String userPasswordNote) {
    this.userPasswordNote = userPasswordNote;
  }


  public AdminInfo onlineAdminModule(Boolean onlineAdminModule) {
    
    this.onlineAdminModule = onlineAdminModule;
    return this;
  }

   /**
   * Indication whether the resource attributes can be directly modified online by the subscribing institution.
   * @return onlineAdminModule
  **/

  @ApiModelProperty(example = "false", value = "Indication whether the resource attributes can be directly modified online by the subscribing institution.")
  @JsonProperty(JSON_PROPERTY_ONLINE_ADMIN_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "online_admin_module")

  public Boolean getOnlineAdminModule() {
    return onlineAdminModule;
  }


  public void setOnlineAdminModule(Boolean onlineAdminModule) {
    this.onlineAdminModule = onlineAdminModule;
  }


  public AdminInfo adminUri(String adminUri) {
    
    this.adminUri = adminUri;
    return this;
  }

   /**
   * The URI of the online administration module.
   * @return adminUri
  **/

  @ApiModelProperty(value = "The URI of the online administration module.")
  @JsonProperty(JSON_PROPERTY_ADMIN_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "admin_uri")

  public String getAdminUri() {
    return adminUri;
  }


  public void setAdminUri(String adminUri) {
    this.adminUri = adminUri;
  }


  public AdminInfo adminUriType(AdminInfoAdminUriType adminUriType) {
    
    this.adminUriType = adminUriType;
    return this;
  }

   /**
   * Get adminUriType
   * @return adminUriType
  **/

  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADMIN_URI_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "admin_uri_type")

  public AdminInfoAdminUriType getAdminUriType() {
    return adminUriType;
  }


  public void setAdminUriType(AdminInfoAdminUriType adminUriType) {
    this.adminUriType = adminUriType;
  }


  public AdminInfo openUrlCompliant(Boolean openUrlCompliant) {
    
    this.openUrlCompliant = openUrlCompliant;
    return this;
  }

   /**
   * Indication whether the electronic content and its content is compliant with an open URI.
   * @return openUrlCompliant
  **/

  @ApiModelProperty(example = "false", value = "Indication whether the electronic content and its content is compliant with an open URI.")
  @JsonProperty(JSON_PROPERTY_OPEN_URL_COMPLIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "open_url_compliant")

  public Boolean getOpenUrlCompliant() {
    return openUrlCompliant;
  }


  public void setOpenUrlCompliant(Boolean openUrlCompliant) {
    this.openUrlCompliant = openUrlCompliant;
  }


  public AdminInfo linkingNote(String linkingNote) {
    
    this.linkingNote = linkingNote;
    return this;
  }

   /**
   * Information about external linking, such as implementation details, or other notes.
   * @return linkingNote
  **/

  @ApiModelProperty(value = "Information about external linking, such as implementation details, or other notes.")
  @JsonProperty(JSON_PROPERTY_LINKING_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "linking_note")

  public String getLinkingNote() {
    return linkingNote;
  }


  public void setLinkingNote(String linkingNote) {
    this.linkingNote = linkingNote;
  }


  public AdminInfo hardwareReqInternal(String hardwareReqInternal) {
    
    this.hardwareReqInternal = hardwareReqInternal;
    return this;
  }

   /**
   * Information about hardware requirements and restrictions - not visible to end users.
   * @return hardwareReqInternal
  **/

  @ApiModelProperty(value = "Information about hardware requirements and restrictions - not visible to end users.")
  @JsonProperty(JSON_PROPERTY_HARDWARE_REQ_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "hardware_req_internal")

  public String getHardwareReqInternal() {
    return hardwareReqInternal;
  }


  public void setHardwareReqInternal(String hardwareReqInternal) {
    this.hardwareReqInternal = hardwareReqInternal;
  }


  public AdminInfo hardwareReqPublic(String hardwareReqPublic) {
    
    this.hardwareReqPublic = hardwareReqPublic;
    return this;
  }

   /**
   * Information about hardware requirements and restrictions - visible to end users.
   * @return hardwareReqPublic
  **/

  @ApiModelProperty(value = "Information about hardware requirements and restrictions - visible to end users.")
  @JsonProperty(JSON_PROPERTY_HARDWARE_REQ_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "hardware_req_public")

  public String getHardwareReqPublic() {
    return hardwareReqPublic;
  }


  public void setHardwareReqPublic(String hardwareReqPublic) {
    this.hardwareReqPublic = hardwareReqPublic;
  }


  public AdminInfo softwareReqInternal(String softwareReqInternal) {
    
    this.softwareReqInternal = softwareReqInternal;
    return this;
  }

   /**
   * Information about software requirements - not visible to end users.
   * @return softwareReqInternal
  **/

  @ApiModelProperty(value = "Information about software requirements - not visible to end users.")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_REQ_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "software_req_internal")

  public String getSoftwareReqInternal() {
    return softwareReqInternal;
  }


  public void setSoftwareReqInternal(String softwareReqInternal) {
    this.softwareReqInternal = softwareReqInternal;
  }


  public AdminInfo softwareReqPublic(String softwareReqPublic) {
    
    this.softwareReqPublic = softwareReqPublic;
    return this;
  }

   /**
   * Information about software requirements - visible to end users.
   * @return softwareReqPublic
  **/

  @ApiModelProperty(value = "Information about software requirements - visible to end users.")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_REQ_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "software_req_public")

  public String getSoftwareReqPublic() {
    return softwareReqPublic;
  }


  public void setSoftwareReqPublic(String softwareReqPublic) {
    this.softwareReqPublic = softwareReqPublic;
  }


  public AdminInfo maintenanceWinValue(String maintenanceWinValue) {
    
    this.maintenanceWinValue = maintenanceWinValue;
    return this;
  }

   /**
   * The provider&#39;s regularly scheduled downtime window for this product. The recurring period of time reserved by the product provider for technical maintenance activities, during which online access may be unavailable.
   * @return maintenanceWinValue
  **/

  @ApiModelProperty(value = "The provider's regularly scheduled downtime window for this product. The recurring period of time reserved by the product provider for technical maintenance activities, during which online access may be unavailable.")
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WIN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "maintenance_win_value")

  public String getMaintenanceWinValue() {
    return maintenanceWinValue;
  }


  public void setMaintenanceWinValue(String maintenanceWinValue) {
    this.maintenanceWinValue = maintenanceWinValue;
  }


  public AdminInfo incidentLog(String incidentLog) {
    
    this.incidentLog = incidentLog;
    return this;
  }

   /**
   * A log of downtime and problem reports, as well as their resolution.
   * @return incidentLog
  **/

  @ApiModelProperty(value = "A log of downtime and problem reports, as well as their resolution.")
  @JsonProperty(JSON_PROPERTY_INCIDENT_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "incident_log")

  public String getIncidentLog() {
    return incidentLog;
  }


  public void setIncidentLog(String incidentLog) {
    this.incidentLog = incidentLog;
  }


  public AdminInfo adminDocumentation(String adminDocumentation) {
    
    this.adminDocumentation = adminDocumentation;
    return this;
  }

   /**
   * Information about and/or location of documentation available for product administrators.
   * @return adminDocumentation
  **/

  @ApiModelProperty(value = "Information about and/or location of documentation available for product administrators.")
  @JsonProperty(JSON_PROPERTY_ADMIN_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "admin_documentation")

  public String getAdminDocumentation() {
    return adminDocumentation;
  }


  public void setAdminDocumentation(String adminDocumentation) {
    this.adminDocumentation = adminDocumentation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminInfo adminInfo = (AdminInfo) o;
    return Objects.equals(this.userId, adminInfo.userId) &&
        Objects.equals(this.userPassword, adminInfo.userPassword) &&
        Objects.equals(this.userPasswordNote, adminInfo.userPasswordNote) &&
        Objects.equals(this.onlineAdminModule, adminInfo.onlineAdminModule) &&
        Objects.equals(this.adminUri, adminInfo.adminUri) &&
        Objects.equals(this.adminUriType, adminInfo.adminUriType) &&
        Objects.equals(this.openUrlCompliant, adminInfo.openUrlCompliant) &&
        Objects.equals(this.linkingNote, adminInfo.linkingNote) &&
        Objects.equals(this.hardwareReqInternal, adminInfo.hardwareReqInternal) &&
        Objects.equals(this.hardwareReqPublic, adminInfo.hardwareReqPublic) &&
        Objects.equals(this.softwareReqInternal, adminInfo.softwareReqInternal) &&
        Objects.equals(this.softwareReqPublic, adminInfo.softwareReqPublic) &&
        Objects.equals(this.maintenanceWinValue, adminInfo.maintenanceWinValue) &&
        Objects.equals(this.incidentLog, adminInfo.incidentLog) &&
        Objects.equals(this.adminDocumentation, adminInfo.adminDocumentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPassword, userPasswordNote, onlineAdminModule, adminUri, adminUriType, openUrlCompliant, linkingNote, hardwareReqInternal, hardwareReqPublic, softwareReqInternal, softwareReqPublic, maintenanceWinValue, incidentLog, adminDocumentation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminInfo2 {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
    sb.append("    userPasswordNote: ").append(toIndentedString(userPasswordNote)).append("\n");
    sb.append("    onlineAdminModule: ").append(toIndentedString(onlineAdminModule)).append("\n");
    sb.append("    adminUri: ").append(toIndentedString(adminUri)).append("\n");
    sb.append("    adminUriType: ").append(toIndentedString(adminUriType)).append("\n");
    sb.append("    openUrlCompliant: ").append(toIndentedString(openUrlCompliant)).append("\n");
    sb.append("    linkingNote: ").append(toIndentedString(linkingNote)).append("\n");
    sb.append("    hardwareReqInternal: ").append(toIndentedString(hardwareReqInternal)).append("\n");
    sb.append("    hardwareReqPublic: ").append(toIndentedString(hardwareReqPublic)).append("\n");
    sb.append("    softwareReqInternal: ").append(toIndentedString(softwareReqInternal)).append("\n");
    sb.append("    softwareReqPublic: ").append(toIndentedString(softwareReqPublic)).append("\n");
    sb.append("    maintenanceWinValue: ").append(toIndentedString(maintenanceWinValue)).append("\n");
    sb.append("    incidentLog: ").append(toIndentedString(incidentLog)).append("\n");
    sb.append("    adminDocumentation: ").append(toIndentedString(adminDocumentation)).append("\n");
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

