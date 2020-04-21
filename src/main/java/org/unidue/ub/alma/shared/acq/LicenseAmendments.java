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
 * The number of amendments attached to the license.
 */
@ApiModel(description = "The number of amendments attached to the license.")
@JsonPropertyOrder({
  LicenseAmendments.JSON_PROPERTY_LINK,
  LicenseAmendments.JSON_PROPERTY_VALUE
})

@XmlRootElement(name = "License2Amendments")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "License2Amendments")
public class LicenseAmendments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LINK = "link";
  @XmlAttribute(name = "link")
  private String link;

  public static final String JSON_PROPERTY_VALUE = "value";
  @XmlElement(name = "xml_value")
  private String value;


  public LicenseAmendments link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "link")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public LicenseAmendments value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "xml_value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseAmendments licenseAmendments = (LicenseAmendments) o;
    return Objects.equals(this.link, licenseAmendments.link) &&
        Objects.equals(this.value, licenseAmendments.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License2Amendments {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

