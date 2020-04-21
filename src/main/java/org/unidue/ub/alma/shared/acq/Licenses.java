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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * A list of licenses.
 */
@ApiModel(description = "A list of licenses.")
@JsonPropertyOrder({
  Licenses.JSON_PROPERTY_TOTAL_RECORD_COUNT,
  Licenses.JSON_PROPERTY_LICENSE
})

@XmlRootElement(name = "licenses")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "licenses")
public class Licenses implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL_RECORD_COUNT = "total_record_count";
  @XmlAttribute(name = "total_record_count")
  private Integer totalRecordCount;

  public static final String JSON_PROPERTY_LICENSE = "license";
  // Is a container wrapped=false
  // items.name=license items.baseName=license items.xmlName= items.xmlNamespace=
  // items.example= items.type=Object
  @XmlElement(name = "license")
  private List<License> license = null;


  public Licenses totalRecordCount(Integer totalRecordCount) {
    
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total number of licenses. This can be used when retrieving the licenses list using pagination.
   * @return totalRecordCount
  **/

  @ApiModelProperty(value = "The total number of licenses. This can be used when retrieving the licenses list using pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "total_record_count")

  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }


  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  public Licenses license(List<License> license) {
    
    this.license = license;
    return this;
  }

  public Licenses addLicenseItem(License licenseItem) {
    if (this.license == null) {
      this.license = new ArrayList<>();
    }
    this.license.add(licenseItem);
    return this;
  }

   /**
   * license object.
   * @return license
  **/

  @ApiModelProperty(value = "license object.")
  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<License> getLicense() {
    return license;
  }


  public void setLicense(List<License> license) {
    this.license = license;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Licenses licenses = (Licenses) o;
    return Objects.equals(this.totalRecordCount, licenses.totalRecordCount) &&
        Objects.equals(this.license, licenses.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecordCount, license);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Licenses {\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
