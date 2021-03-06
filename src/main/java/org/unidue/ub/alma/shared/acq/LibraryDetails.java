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
 * Information regarding the item&#39;s owning library. Output parameter. Returned only when view&#x3D;label.
 */
@ApiModel(description = "Information regarding the item's owning library. Output parameter. Returned only when view=label.")
@JsonPropertyOrder({
  LibraryDetails.JSON_PROPERTY_ADDRESS
})

@XmlRootElement(name = "library_details")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "library_details")
public class LibraryDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @XmlElement(name = "address")
  private LibraryAddress address;


  public LibraryDetails address(LibraryAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/

  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "address")

  public LibraryAddress getAddress() {
    return address;
  }


  public void setAddress(LibraryAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryDetails libraryDetails = (LibraryDetails) o;
    return Objects.equals(this.address, libraryDetails.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryDetails {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

