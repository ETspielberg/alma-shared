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
 * Specific user to be annotated.
 */
@ApiModel(description = "Specific user to be annotated.")
@JsonPropertyOrder({
  InterestedUser.JSON_PROPERTY_PRIMARY_ID,
  InterestedUser.JSON_PROPERTY_NOTIFY_RECEIVING_ACTIVATION,
  InterestedUser.JSON_PROPERTY_HOLD_ITEM,
  InterestedUser.JSON_PROPERTY_NOTIFY_RENEWAL,
  InterestedUser.JSON_PROPERTY_NOTIFY_CANCEL,
  InterestedUser.JSON_PROPERTY_FIRST_NAME,
  InterestedUser.JSON_PROPERTY_LAST_NAME,
  InterestedUser.JSON_PROPERTY_EMAIL
})

@XmlRootElement(name = "interested_user")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "interested_user")
public class InterestedUser implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRIMARY_ID = "primary_id";
  @XmlElement(name = "primary_id")
  private String primaryId;

  public static final String JSON_PROPERTY_NOTIFY_RECEIVING_ACTIVATION = "notify_receiving_activation";
  @XmlElement(name = "notify_receiving_activation")
  private Boolean notifyReceivingActivation;

  public static final String JSON_PROPERTY_HOLD_ITEM = "hold_item";
  @XmlElement(name = "hold_item")
  private Boolean holdItem;

  public static final String JSON_PROPERTY_NOTIFY_RENEWAL = "notify_renewal";
  @XmlElement(name = "notify_renewal")
  private Boolean notifyRenewal;

  public static final String JSON_PROPERTY_NOTIFY_CANCEL = "notify_cancel";
  @XmlElement(name = "notify_cancel")
  private Boolean notifyCancel;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  @XmlElement(name = "first_name")
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  @XmlElement(name = "last_name")
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @XmlElement(name = "email")
  private String email;


  public InterestedUser primaryId(String primaryId) {
    
    this.primaryId = primaryId;
    return this;
  }

   /**
   * User&#39;s primary identifier.
   * @return primaryId
  **/

  @ApiModelProperty(value = "User's primary identifier.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "primary_id")

  public String getPrimaryId() {
    return primaryId;
  }


  public void setPrimaryId(String primaryId) {
    this.primaryId = primaryId;
  }


  public InterestedUser notifyReceivingActivation(Boolean notifyReceivingActivation) {
    
    this.notifyReceivingActivation = notifyReceivingActivation;
    return this;
  }

   /**
   * When true, Alma sends an email to the user when the item arrives at the library&#39;s receiving department. Optional. Default is False.
   * @return notifyReceivingActivation
  **/

  @ApiModelProperty(example = "false", value = "When true, Alma sends an email to the user when the item arrives at the library's receiving department. Optional. Default is False.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_RECEIVING_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "notify_receiving_activation")

  public Boolean getNotifyReceivingActivation() {
    return notifyReceivingActivation;
  }


  public void setNotifyReceivingActivation(Boolean notifyReceivingActivation) {
    this.notifyReceivingActivation = notifyReceivingActivation;
  }


  public InterestedUser holdItem(Boolean holdItem) {
    
    this.holdItem = holdItem;
    return this;
  }

   /**
   * When true, Alma creates a hold request on the item for the user. Optional. Relevant only for physical items. Default is False.
   * @return holdItem
  **/

  @ApiModelProperty(example = "false", value = "When true, Alma creates a hold request on the item for the user. Optional. Relevant only for physical items. Default is False.")
  @JsonProperty(JSON_PROPERTY_HOLD_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "hold_item")

  public Boolean getHoldItem() {
    return holdItem;
  }


  public void setHoldItem(Boolean holdItem) {
    this.holdItem = holdItem;
  }


  public InterestedUser notifyRenewal(Boolean notifyRenewal) {
    
    this.notifyRenewal = notifyRenewal;
    return this;
  }

   /**
   * When true, Alma sends a notification letter to the user when the order is sent to manual renewal. Optional. Relevant only for continuous orders. Default is False.
   * @return notifyRenewal
  **/

  @ApiModelProperty(example = "false", value = "When true, Alma sends a notification letter to the user when the order is sent to manual renewal. Optional. Relevant only for continuous orders. Default is False.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_RENEWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "notify_renewal")

  public Boolean getNotifyRenewal() {
    return notifyRenewal;
  }


  public void setNotifyRenewal(Boolean notifyRenewal) {
    this.notifyRenewal = notifyRenewal;
  }


  public InterestedUser notifyCancel(Boolean notifyCancel) {
    
    this.notifyCancel = notifyCancel;
    return this;
  }

   /**
   * When true, Alma sends a notification letter to the user when the order is canceled. Optional. Default is False.
   * @return notifyCancel
  **/

  @ApiModelProperty(example = "false", value = "When true, Alma sends a notification letter to the user when the order is canceled. Optional. Default is False.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_CANCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "notify_cancel")

  public Boolean getNotifyCancel() {
    return notifyCancel;
  }


  public void setNotifyCancel(Boolean notifyCancel) {
    this.notifyCancel = notifyCancel;
  }


  public InterestedUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * User&#39;s first name. Output parameter.
   * @return firstName
  **/

  @ApiModelProperty(example = "John", value = "User's first name. Output parameter.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "first_name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public InterestedUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * User&#39;s last name. Output parameter.
   * @return lastName
  **/

  @ApiModelProperty(example = "Smith", value = "User's last name. Output parameter.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "last_name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public InterestedUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address. Output parameter.
   * @return email
  **/

  @ApiModelProperty(example = "jsmith@gmail.com", value = "User's email address. Output parameter.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestedUser interestedUser = (InterestedUser) o;
    return Objects.equals(this.primaryId, interestedUser.primaryId) &&
        Objects.equals(this.notifyReceivingActivation, interestedUser.notifyReceivingActivation) &&
        Objects.equals(this.holdItem, interestedUser.holdItem) &&
        Objects.equals(this.notifyRenewal, interestedUser.notifyRenewal) &&
        Objects.equals(this.notifyCancel, interestedUser.notifyCancel) &&
        Objects.equals(this.firstName, interestedUser.firstName) &&
        Objects.equals(this.lastName, interestedUser.lastName) &&
        Objects.equals(this.email, interestedUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryId, notifyReceivingActivation, holdItem, notifyRenewal, notifyCancel, firstName, lastName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestedUser2 {\n");
    sb.append("    primaryId: ").append(toIndentedString(primaryId)).append("\n");
    sb.append("    notifyReceivingActivation: ").append(toIndentedString(notifyReceivingActivation)).append("\n");
    sb.append("    holdItem: ").append(toIndentedString(holdItem)).append("\n");
    sb.append("    notifyRenewal: ").append(toIndentedString(notifyRenewal)).append("\n");
    sb.append("    notifyCancel: ").append(toIndentedString(notifyCancel)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

