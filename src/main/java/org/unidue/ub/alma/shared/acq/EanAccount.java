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
 * Mapping of EAN (Envelope Address Node) code to the vendor account.
 */
@ApiModel(description = "Mapping of EAN (Envelope Address Node) code to the vendor account.")
@JsonPropertyOrder({
  EanAccount.JSON_PROPERTY_ACCOUNT,
  EanAccount.JSON_PROPERTY_EAN_CODE
})

@XmlRootElement(name = "ean_account")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ean_account")
public class EanAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  @XmlElement(name = "account")
  private String account;

  public static final String JSON_PROPERTY_EAN_CODE = "ean_code";
  @XmlElement(name = "ean_code")
  private String eanCode;


  public EanAccount account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The code of the vendor account to map. Should be a valid account of this vendor.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The code of the vendor account to map. Should be a valid account of this vendor.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  @JacksonXmlProperty(localName = "account")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public EanAccount eanCode(String eanCode) {
    
    this.eanCode = eanCode;
    return this;
  }

   /**
   * The EAN code.
   * @return eanCode
  **/
  @ApiModelProperty(required = true, value = "The EAN code.")
  @JsonProperty(JSON_PROPERTY_EAN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  @JacksonXmlProperty(localName = "ean_code")

  public String getEanCode() {
    return eanCode;
  }


  public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EanAccount eanAccount = (EanAccount) o;
    return Objects.equals(this.account, eanAccount.account) &&
        Objects.equals(this.eanCode, eanAccount.eanCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, eanCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EanAccount2 {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    eanCode: ").append(toIndentedString(eanCode)).append("\n");
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
