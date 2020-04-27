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
 * A specific library that the vendor works with. Note that the include_sub_units attribute is mandatory.
 */
@ApiModel(description = "A specific library that the vendor works with. Note that the include_sub_units attribute is mandatory.")
@JsonPropertyOrder({
  Library.JSON_PROPERTY_INCLUDE_SUB_UNITS,
  Library.JSON_PROPERTY_CODE
})

@XmlRootElement(name = "library")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "library")
public class Library implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INCLUDE_SUB_UNITS = "include_sub_units";
  @XmlAttribute(name = "include_sub_units")
  private Boolean includeSubUnits;

  public static final String JSON_PROPERTY_CODE = "code";
  @XmlElement(name = "code")
  private LibraryCode code;


  public Library includeSubUnits(Boolean includeSubUnits) {
    
    this.includeSubUnits = includeSubUnits;
    return this;
  }

   /**
   * Get includeSubUnits
   * @return includeSubUnits
  **/

  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_SUB_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(isAttribute = true, localName = "include_sub_units")

  public Boolean getIncludeSubUnits() {
    return includeSubUnits;
  }


  public void setIncludeSubUnits(Boolean includeSubUnits) {
    this.includeSubUnits = includeSubUnits;
  }


  public Library code(LibraryCode code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/

  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "code")

  public LibraryCode getCode() {
    return code;
  }


  public void setCode(LibraryCode code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Library library = (Library) o;
    return Objects.equals(this.includeSubUnits, library.includeSubUnits) &&
        Objects.equals(this.code, library.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSubUnits, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Library2 {\n");
    sb.append("    includeSubUnits: ").append(toIndentedString(includeSubUnits)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
